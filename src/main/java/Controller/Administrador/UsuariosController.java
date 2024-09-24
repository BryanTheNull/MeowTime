package Controller.Administrador;

import Config.CustomTableCellRenderer;
import Config.EmailUtils;
import Config.PasswordUtils;
import Config.RutUtils;
import Model.Empleado;
import View.Administrador.FormularioUsuario;
import View.Administrador.PanelUsuarios;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author The Chickens
 * @since 05-09-2024
 */

public class UsuariosController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private PanelUsuarios panelUsuarios;
    private UsuariosOperation usuariosOp = new UsuariosOperation();
    private FormularioUsuario formularioUsuario;
    private Frame frame;

    Empleado e = new Empleado();
    DefaultTableModel model = new DefaultTableModel();

    public UsuariosController(PanelUsuarios panelUsuarios) {
        this.panelUsuarios = panelUsuarios;
        this.panelUsuarios.btnRegistrarUsuario.addActionListener(this);
        this.panelUsuarios.btnModificarUsuario.addActionListener(this);
        this.panelUsuarios.btnRefrescarTabla.addActionListener(this);
        this.panelUsuarios.btnEliminarUsuario.addActionListener(this);

        this.formularioUsuario = new FormularioUsuario(frame, true);
        this.formularioUsuario.btnGestionarUsuario.addActionListener(this);
        this.formularioUsuario.btnCancelarUsuario.addActionListener(this);
        this.formularioUsuario.jCheckBoxGenerarEmail.addActionListener(this);
        this.formularioUsuario.jCheckBoxContraseña.addActionListener(this);

        consultarUsuarios(panelUsuarios.jTableUsuarios);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Eventos para manejar los botones de a ventana princial
        if (e.getSource() == panelUsuarios.btnRegistrarUsuario) {
            cargarNombreCargos();
            formularioUsuario.btnGestionarUsuario.setText("Registrar Usuario");
            formularioUsuario.setVisible(true);

        }
        if (e.getSource() == panelUsuarios.btnModificarUsuario) {
            cargarNombreCargos();
            formularioUsuario.btnGestionarUsuario.setText("Guardar Usuario");
            limpiarFormulario();
            modificarUsuario();
            formularioUsuario.setVisible(true);

        }
        if (e.getSource() == panelUsuarios.btnRefrescarTabla) {
            consultarUsuarios(panelUsuarios.jTableUsuarios);
            JOptionPane.showMessageDialog(panelUsuarios, "La tabla ha sido actualizada exitosamente.", "Actualización de Tabla", JOptionPane.INFORMATION_MESSAGE);
        }
        if (e.getSource() == panelUsuarios.btnEliminarUsuario) {
            eliminarUsuario();
        }

        // Eventos para manejar los botones del formulario de usuario
        if (e.getSource() == formularioUsuario.btnGestionarUsuario) {
            String estadobtn = formularioUsuario.btnGestionarUsuario.getText();
            if (estadobtn.equals("Registrar Usuario")) {
                if (validarFormulario()) {
                    registrarUsuario();
                }
            } else {
                if (validarFormulario()) {
                    actualizarUsuario();
                }
            }
        }
        if (e.getSource() == formularioUsuario.btnCancelarUsuario) {
            formularioUsuario.dispose();
        }

        if (e.getSource() == formularioUsuario.jCheckBoxGenerarEmail) {
            String primerNombre = formularioUsuario.txtPrimerNombre.getText();
            String primerApellido = formularioUsuario.txtPrimerApellido.getText();
            if (primerNombre.isEmpty() || primerApellido.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Para generar una sugerencia de correo electrónico, es obligatorio ingresar tanto el primer nombre como el primer apellido.", "Error en la generación de Correo Electrónico", JOptionPane.ERROR_MESSAGE);
                formularioUsuario.jCheckBoxGenerarEmail.setSelected(false);
            } else {
                if (!formularioUsuario.jCheckBoxGenerarEmail.isSelected()) {
                    formularioUsuario.txtEmail.setText("");
                } else {
                    generarEmail();
                }
            }
        }

        if (e.getSource() == formularioUsuario.jCheckBoxContraseña) {
            String primerNombre = formularioUsuario.txtPrimerNombre.getText();
            String primerApellido = formularioUsuario.txtPrimerApellido.getText();
            if (primerNombre.isEmpty() || primerApellido.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Para generar una sugerencia de contraseña, es obligatorio ingresar tanto el primer nombre como el primer apellido.", "Error en la generación de contraseña", JOptionPane.ERROR_MESSAGE);
                formularioUsuario.jCheckBoxContraseña.setSelected(false);
            } else {
                if (!formularioUsuario.jCheckBoxContraseña.isSelected()) {
                    formularioUsuario.txtContraseña.setText("");
                } else {
                    generarContraseña();
                }
            }
        }
    }

    private void consultarUsuarios(JTable tablaUsuarios) {
        model.setRowCount(0);
        model = (DefaultTableModel) tablaUsuarios.getModel();
        tablaUsuarios.setModel(model);

        List<Empleado> lista = usuariosOp.SQL_ConsultarUsuarios();
        Object[] objeto = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getID_Empleado();
            objeto[1] = lista.get(i).getPrimerNombre();
            objeto[2] = lista.get(i).getPrimerApellido();
            objeto[3] = lista.get(i).getCargo();
            objeto[4] = lista.get(i).getEmail();
            objeto[5] = lista.get(i).getRut();
            objeto[6] = lista.get(i).getFechaRegistro();
            model.addRow(objeto);
        }

        // Establecer la altura de las filas
        tablaUsuarios.setRowHeight(30); // Ajusta este valor según tus necesidades

        // Aplicar el renderer a todas las columnas
        for (int i = 0; i < tablaUsuarios.getColumnCount(); i++) {
            tablaUsuarios.getColumnModel().getColumn(i).setCellRenderer(new CustomTableCellRenderer());
        }
    }

    private void registrarUsuario() {
        // Obtener los datos del nuevo usuario
        String primerNombre = formularioUsuario.txtPrimerNombre.getText();
        String segundoNombre = formularioUsuario.txtSegundoNombre.getText();
        String primerApellido = formularioUsuario.txtPrimerApellido.getText();
        String segundoApellido = formularioUsuario.txtSegundoApellido.getText();
        String cargo = formularioUsuario.jComboBoxCargo.getSelectedItem().toString();
        String rut = formularioUsuario.txtRut.getText();
        String email = formularioUsuario.txtEmail.getText();
        String contraseña = formularioUsuario.txtContraseña.getText();

        // Setear los valores a la clase model Empleado
        e.setPrimerNombre(primerNombre);
        e.setSegundoNombre(segundoNombre);
        e.setPrimerApellido(primerApellido);
        e.setSegundoApellido(segundoApellido);
        e.setCargo(cargo);
        e.setRut(rut);
        e.setEmail(email);
        e.setContraseña(PasswordUtils.hashPassword(contraseña));

        // Intentar agregar al usuario y verificar si se realiza correctamente.
        int r = usuariosOp.SQL_AgregarNuevoUsuario(e);
        if (r == 1) {
            JOptionPane.showMessageDialog(frame, "El Usuario ha sido añadido exitosamente.", "Usuario añadido", JOptionPane.INFORMATION_MESSAGE);
            formularioUsuario.dispose();
            consultarUsuarios(panelUsuarios.jTableUsuarios);
        } else {
            JOptionPane.showMessageDialog(frame, "Se ha producido un error al intentar añadir el nuevo usuario.", "Error al añadir usuario", JOptionPane.ERROR_MESSAGE);
        }
        limpiarFormulario();
    }

    private void modificarUsuario() {
        int fila = panelUsuarios.jTableUsuarios.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(panelUsuarios, "Debe seleccionar un usuario para modificar", "Usuario no seleccionada", JOptionPane.ERROR_MESSAGE);
        } else {
            // OBTENER LOS DATOS DE LA TABLA
            String ID_Usuario = panelUsuarios.jTableUsuarios.getValueAt(fila, 0).toString();
            String nombres = panelUsuarios.jTableUsuarios.getValueAt(fila, 1).toString();
            String apellidos = panelUsuarios.jTableUsuarios.getValueAt(fila, 2).toString();
            String cargo = panelUsuarios.jTableUsuarios.getValueAt(fila, 3).toString();
            String rut = panelUsuarios.jTableUsuarios.getValueAt(fila, 5).toString();
            String email = panelUsuarios.jTableUsuarios.getValueAt(fila, 4).toString();

            // Dividir el nombre y apellidos por los espacios
            String[] nombresSeparados = nombres.split(" ");
            String[] apellidosSeparados = apellidos.split(" ");

            // Verificar cuántos nombres hay
            if (nombresSeparados.length == 2) {
                String primerNombre = nombresSeparados[0]; // ej.- Bryan
                String segundoNombre = nombresSeparados[1]; // ej.- Antonio
                formularioUsuario.txtPrimerNombre.setText(primerNombre);
                formularioUsuario.txtSegundoNombre.setText(segundoNombre);

            } else if (nombresSeparados.length == 1) {
                String primerNombre = nombresSeparados[0]; // ej.- Solo un nombre, Bryan
                formularioUsuario.txtPrimerNombre.setText(primerNombre);
            }

            // Verificar cuántos apellidos hay
            if (apellidosSeparados.length == 2) {
                String primerApellido = apellidosSeparados[0]; // ej.- Vera
                String segundoApellido = apellidosSeparados[1]; // ej.- Aguilera
                formularioUsuario.txtPrimerApellido.setText(primerApellido);
                formularioUsuario.txtSegundoApellido.setText(segundoApellido);

            } else if (apellidosSeparados.length == 1) {
                String primerApellido = apellidosSeparados[0]; // ej.- Solo un apellido, Vera
                formularioUsuario.txtPrimerApellido.setText(primerApellido);
            }

            // SETEAR LOS VALORES EN LOS CAMPOS DEL FORMULARIO
            formularioUsuario.txtID_Usuario.setText(ID_Usuario);
            formularioUsuario.jComboBoxCargo.setSelectedItem(cargo);
            formularioUsuario.txtRut.setText(rut);
            formularioUsuario.txtEmail.setText(email);
            formularioUsuario.jCheckBoxGenerarEmail.setSelected(true);
            formularioUsuario.jCheckBoxContraseña.setSelected(false);

            // Eliminar la contraseña
            formularioUsuario.txtContraseña.setText("contraseña :)");
            formularioUsuario.jCheckBoxContraseña.setVisible(false);
            formularioUsuario.txtContraseña.setVisible(false);
            formularioUsuario.lbContraseña.setVisible(false);

        }
    }

    private void eliminarUsuario() {
        int fila = panelUsuarios.jTableUsuarios.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(panelUsuarios, "Debe seleccionar un usuario para eliminar", "Usuario no seleccionado", JOptionPane.ERROR_MESSAGE);
        } else {
            int ID_Categoria = (int) panelUsuarios.jTableUsuarios.getValueAt(fila, 0);
            int r = usuariosOp.SQL_EliminarUsuario(ID_Categoria);
            if (r == 1) {
                JOptionPane.showMessageDialog(panelUsuarios, "Usuario eliminado con exito.", "Usuario Eliminado", JOptionPane.INFORMATION_MESSAGE);
                consultarUsuarios(panelUsuarios.jTableUsuarios);
            } else {
                JOptionPane.showMessageDialog(panelUsuarios, "Se ha producido un error al intentar eliminar al usuario seleccionado.", "Error al elimianar Usuario", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private boolean validarFormulario() {
        String primerNombre = formularioUsuario.txtPrimerNombre.getText();
        String primerApellido = formularioUsuario.txtPrimerApellido.getText();
        String cargo = formularioUsuario.jComboBoxCargo.getSelectedItem().toString();
        String rut = formularioUsuario.txtRut.getText();
        String email = formularioUsuario.txtEmail.getText();
        String contraseña = formularioUsuario.txtContraseña.getText();

        // Verificar campos nombre y apellidos
        if (primerNombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "El primer nombre no puede estar vacío.", "Nombre inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (primerApellido.trim().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "El primer apellido no puede estar vacío.", "Apellido inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!RutUtils.verificarFormatoRut(rut.trim())) {
            JOptionPane.showMessageDialog(frame, "El rut ingresado es invalido.", "Rut inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!EmailUtils.verificarFormatoEmail(email.trim())) {
            JOptionPane.showMessageDialog(frame, "El email ingresado es invalido", "Email inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (cargo.equals("<Seleccione un Cargo>")) {
            JOptionPane.showMessageDialog(frame, "El cargo ingresado es invalido", "Cargo inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Por favor, seleccione la contraseña automatica", "Contraseña inválida", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;  // Si todo es válido  
    }

    private void cargarNombreCargos() {
        List<String> datosNombresCargos = usuariosOp.SQL_ConsultarNombresCargos();
        formularioUsuario.jComboBoxCargo.removeAllItems();
        formularioUsuario.jComboBoxCargo.addItem("<Seleccione un Cargo>");

        // Agregar los nombres de cargos obtenidos
        for (String nombreCargo : datosNombresCargos) {
            formularioUsuario.jComboBoxCargo.addItem(nombreCargo);
        }
        formularioUsuario.jComboBoxCargo.setSelectedIndex(0);
    }

    private void generarEmail() {
        String primerNombre = formularioUsuario.txtPrimerNombre.getText();
        String primerApellido = formularioUsuario.txtPrimerApellido.getText();

        // Obtener inicial del nombre y convertir apellido en minusculas
        String inicialNombre = primerNombre.substring(0, 1).toLowerCase();
        String apellidoMinuscula = primerApellido.toLowerCase();

        // Generar un numero aleatorio de 2 digitos
        Random random = new Random();
        int numeroAleatorio = random.nextInt(900) + 100;

        // Construir el email
        String email = inicialNombre + "." + apellidoMinuscula + numeroAleatorio + "@gmail.com";

        // Cargar el email
        formularioUsuario.txtEmail.setText(email);
    }

    private void generarContraseña() {
        String primerNombre = formularioUsuario.txtPrimerNombre.getText();
        String primerApellido = formularioUsuario.txtPrimerApellido.getText();

        // Obtener la primera letra del nombre
        String inicialNombre = primerNombre.substring(0, 1).toUpperCase();

        // Añadir algunos números aleatorios para hacer la contraseña más segura
        Random random = new Random();
        int numeroAleatorio = random.nextInt(9000) + 1000; // Genera un número entre 1000 y 9999

        // Combinar para formar la contraseña
        String contraseña = inicialNombre + primerApellido.toLowerCase() + numeroAleatorio;

        // Cargar contraseña
        formularioUsuario.txtContraseña.setText(contraseña);
    }

    private void limpiarFormulario() {
        formularioUsuario.txtPrimerNombre.setText("");
        formularioUsuario.txtSegundoNombre.setText("");
        formularioUsuario.txtPrimerApellido.setText("");
        formularioUsuario.txtSegundoApellido.setText("");
        formularioUsuario.jComboBoxCargo.setSelectedItem(1);
        formularioUsuario.txtRut.setText("");
        formularioUsuario.txtEmail.setText("");
        formularioUsuario.txtContraseña.setText("");
        formularioUsuario.jCheckBoxGenerarEmail.setSelected(false);
        formularioUsuario.jCheckBoxContraseña.setSelected(false);
    }

    private void actualizarUsuario() {
        // Obtener los datos del nuevo usuario
        int ID_Usuario = Integer.parseInt(formularioUsuario.txtID_Usuario.getText());
        String primerNombre = formularioUsuario.txtPrimerNombre.getText();
        String segundoNombre = formularioUsuario.txtSegundoNombre.getText();
        String primerApellido = formularioUsuario.txtPrimerApellido.getText();
        String segundoApellido = formularioUsuario.txtSegundoApellido.getText();
        String cargo = formularioUsuario.jComboBoxCargo.getSelectedItem().toString();
        String rut = formularioUsuario.txtRut.getText();
        String email = formularioUsuario.txtEmail.getText();
        String contraseña = usuariosOp.SQL_ConsultarContraseña(ID_Usuario);

        // Setear los valores a la clase model Empleado
        e.setID_Empleado(ID_Usuario);
        e.setPrimerNombre(primerNombre);
        e.setSegundoNombre(segundoNombre);
        e.setPrimerApellido(primerApellido);
        e.setSegundoApellido(segundoApellido);
        e.setCargo(cargo);
        e.setRut(rut);
        e.setEmail(email);
        e.setContraseña(contraseña);

        // Intentar actualizar al usuario y verificar si se realiza correctamente.
        int r = usuariosOp.SQL_AgregarNuevoUsuario(e);
        if (r == 1) {
            JOptionPane.showMessageDialog(frame, "El Usuario ha sido actualizado exitosamente.", "Usuario actualizado con exito.", JOptionPane.INFORMATION_MESSAGE);
            formularioUsuario.dispose();
            consultarUsuarios(panelUsuarios.jTableUsuarios);
        } else {
            JOptionPane.showMessageDialog(frame, "Se ha producido un error al intentar actualizar el usuario.", "Error al actualizar usuario.", JOptionPane.ERROR_MESSAGE);
        }
        limpiarFormulario();
    }
}
