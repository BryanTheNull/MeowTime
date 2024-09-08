package Controller.Usuario;

import Model.Usuario;
import View.Usuario.PanelRegistrarAsistencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * @author Bryan Vera
 * @since 02-09-2024
 */
public class RegistrarAsistenciaController implements ActionListener {

    // Iniciar conexion a la base de datos
    RegistrarAsistenciaOperation registrarAsistenciaOp = new RegistrarAsistenciaOperation();

    // Inicializar vista del controllador y sus operaciones
    private PanelRegistrarAsistencia panelRegistrarAsistencia;

    public RegistrarAsistenciaController(PanelRegistrarAsistencia panelRegistrarAsistencia) {
        this.panelRegistrarAsistencia = panelRegistrarAsistencia;
        this.panelRegistrarAsistencia.btnRegistrarAsistencia.addActionListener(this);

        // Cargar datos al iniciar el constructor
        obtenerDatosUsuario();
        verificarEntradaSalida();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelRegistrarAsistencia.btnRegistrarAsistencia) {
            // Manejo del boton para registrar la Entrada o la Salida del empleado.
            String estadoBoton = panelRegistrarAsistencia.btnRegistrarAsistencia.getText();
            if (estadoBoton.equals("Registrar Entrada")) {
                int decision = JOptionPane.showConfirmDialog(panelRegistrarAsistencia, "Estás a punto de registrar tu entrada. ¿Deseas continuar con el registro?", "Confirmación de Registro de Entrada", JOptionPane.YES_NO_OPTION);
                if (decision == JOptionPane.YES_OPTION) {
                    registrarEntrada();
                    panelRegistrarAsistencia.btnRegistrarAsistencia.setText("Registrar Salida");
                }
            } else if (estadoBoton.equals("Registrar Salida")) {
                int decision = JOptionPane.showConfirmDialog(panelRegistrarAsistencia, "Estás a punto de registrar tu salida. ¿Deseas continuar con el registro?", "Confirmación de Registro de Salida", JOptionPane.YES_NO_OPTION);
                if (decision == JOptionPane.YES_OPTION) {
                    registrarSalida();
                    panelRegistrarAsistencia.btnRegistrarAsistencia.setText("Registro Completo");
                }
            } else if (estadoBoton.equals("Registro Completo")) {
                JOptionPane.showMessageDialog(panelRegistrarAsistencia, "Ya has registrado tu entrada y salida para el día de hoy.", "Registro Completo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    void obtenerDatosUsuario() {
        Usuario user = Usuario.getInstance();
        panelRegistrarAsistencia.txtNombre.setText(user.getPrimerNombre() + " " + user.getSegundoNombre());
        panelRegistrarAsistencia.txtApellido.setText(user.getPrimerApellido() + " " + user.getSegundoApellido());
        panelRegistrarAsistencia.txtRut.setText(user.getRut());
        panelRegistrarAsistencia.txtEmail.setText(user.getEmail());
        panelRegistrarAsistencia.txtCargo.setText(user.getCargo());
    }

    void verificarEntradaSalida() {
        /**
         * @Descripcion Funcion para verificar si el usuario ya registro su
         * entrada o no. Si el usuario ya tiene su entrada diaria registrada el
         * boton le dara la opcion de registrar su salida, en el caso contrario
         * va a poder registrar su entrada.
         *
         * @return boolean - Retorna true si el usuario ya ha registrado su
         * entrada, false si no lo ha hecho.
         */

        Usuario user = Usuario.getInstance();
        int ID_Usuario = user.getID_Usuario();

        boolean tieneEntrada = registrarAsistenciaOp.SQL_VerificarEntrada(ID_Usuario);

        if (!tieneEntrada) {
            panelRegistrarAsistencia.btnRegistrarAsistencia.setText("Registrar Entrada");
        } else {
            panelRegistrarAsistencia.btnRegistrarAsistencia.setText("Registrar Salida");
        }

    }

    void registrarEntrada() {
        Usuario user = Usuario.getInstance();
        int ID_Usuario = user.getID_Usuario();

        String sql = "INSERT INTO Asistencias (ID_Usuario, Fecha, Entrada) VALUES(?,CURDATE(), CURTIME())";

        int r = registrarAsistenciaOp.SQL_RegistrarAsistencia(sql, ID_Usuario);

        if (r == 1) {
            JOptionPane.showMessageDialog(panelRegistrarAsistencia, "La entrada ha sido registrada con éxito.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(panelRegistrarAsistencia, "No se pudo registrar la entrada, Inténtalo nuevamente.", "Error de Registro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    void registrarSalida() {
        Usuario user = Usuario.getInstance();
        int ID_Usuario = user.getID_Usuario();

        String sql = "UPDATE Asistencias SET Salida = curtime() Where ID_Usuario =? AND Fecha = curdate();";

        int r = registrarAsistenciaOp.SQL_RegistrarAsistencia(sql, ID_Usuario);

        if (r == 1) {
            JOptionPane.showMessageDialog(panelRegistrarAsistencia, "Salida registrada con exito", "Salida Registrada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(panelRegistrarAsistencia, "No se pudo registrar la salida, Inténtalo nuevamente.", "Error de Registro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
