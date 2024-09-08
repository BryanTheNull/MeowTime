package Controller.Administrador;

import Model.Empleado;
import View.Administrador.PanelUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * @author The Chickens
 * @since 05-09-2024
 */
public class UsuariosController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private PanelUsuarios panelUsuarios;
    private UsuariosOperation usuariosOp = new UsuariosOperation();

    Empleado e = new Empleado();
    DefaultTableModel model = new DefaultTableModel();

    public UsuariosController(PanelUsuarios panelUsuarios) {
        this.panelUsuarios = panelUsuarios;
        this.panelUsuarios.btnRegistrarUsuario.addActionListener(this);
        this.panelUsuarios.btnModificarUsuario.addActionListener(this);
        this.panelUsuarios.btnEliminarUsuario.addActionListener(this);
        
        consultarUsuarios(panelUsuarios.jTableUsuarios);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(panelUsuarios, "Mensaje", "Titulo", JOptionPane.INFORMATION_MESSAGE);
    }

    private void consultarUsuarios(JTable tablaUsuarios) {
//        limpiarTablaUsuarios();
//        centrarCeldasUsuarios(tablaUsuarios);
//        model = (DefaultTableModel) tablaUsuarios.getModel();
//        tablaUsuarios.setModel(model);
//
//        List<Empleado> lista = usuariosOp.SQL_ConsultarUsuarios();
//        Object[] objeto = new Object[6];
//        for (int i = 0; i < lista.size(); i++) {
//            objeto[0] = lista.get(i).getID_Empleado();
//            objeto[1] = lista.get(i).getPrimerNombre();
//            objeto[2] = lista.get(i).getPrimerApellido();
//            objeto[3] = lista.get(i).getCargo();
//            objeto[4] = lista.get(i).getEmail();
//            objeto[5] = lista.get(i).getFechaRegistro();
//
//            // Agregar un botón en la última columna
//            JButton button = new JButton("Modificar");
//            button.addActionListener(e -> {
//                // Acción a realizar cuando el botón es presionado
//                // Por ejemplo: eliminar el empleado de la base de datos y actualizar la tabla
//                int rowIndex = tablaUsuarios.convertRowIndexToModel(tablaUsuarios.getSelectedRow());
//                // Realiza la acción de eliminar aquí
//            });
//            objeto[6] = button; // Asignar el botón a la columna "Acciones"
//
//            model.addRow(objeto);
//        }
    }

    private void centrarCeldasUsuarios(JTable tablaUsuarios) {
        DefaultTableCellRenderer dtm = new DefaultTableCellRenderer();
        dtm.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < panelUsuarios.jTableUsuarios.getColumnCount(); i++) {
            tablaUsuarios.getColumnModel().getColumn(i).setCellRenderer(dtm);
        }
    }

    private void limpiarTablaUsuarios() {
        for (int i = 0; i < panelUsuarios.jTableUsuarios.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

}
