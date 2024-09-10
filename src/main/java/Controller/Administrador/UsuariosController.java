package Controller.Administrador;

import Config.CustomTableCellRenderer;
import Model.Empleado;
import View.Administrador.FormularioUsuario;
import View.Administrador.PanelUsuarios;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
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
        this.formularioUsuario = new FormularioUsuario(frame, true);
        this.panelUsuarios.btnRegistrarUsuario.addActionListener(this);
        this.panelUsuarios.btnModificarUsuario.addActionListener(this);
        this.panelUsuarios.btnRefrescarTabla.addActionListener(this);
        this.panelUsuarios.btnEliminarUsuario.addActionListener(this);

        consultarUsuarios(panelUsuarios.jTableUsuarios);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelUsuarios.btnRegistrarUsuario) {
            formularioUsuario.setVisible(true);
        }
        if (e.getSource() == panelUsuarios.btnModificarUsuario) {
            formularioUsuario.setVisible(true);
        }
        if (e.getSource() == panelUsuarios.btnRefrescarTabla) {
            consultarUsuarios(panelUsuarios.jTableUsuarios);
        }
        if (e.getSource() == panelUsuarios.btnEliminarUsuario) {
            eliminarUsuario();
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

    private void eliminarUsuario() {
        int fila = panelUsuarios.jTableUsuarios.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(panelUsuarios, "Debe seleccionar una fila para eliminar", "Fila no seleccionada", JOptionPane.ERROR_MESSAGE);
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
}
