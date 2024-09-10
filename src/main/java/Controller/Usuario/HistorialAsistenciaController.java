package Controller.Usuario;

import Config.CustomTableCellRenderer;
import Model.Empleado;
import Model.Usuario;
import View.Usuario.PanelHistorialAsistencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Bryan Vera
 * @since 05-09-2024
 */
public class HistorialAsistenciaController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private PanelHistorialAsistencia panelHistorialAsistencia;
    private HistorialAsistenciaOperation HistorialAsistenciaOp = new HistorialAsistenciaOperation();
    
     // Iniciar clase Model de Empleado y tabla por defecto
    DefaultTableModel model = new DefaultTableModel();
    Empleado e = new Empleado();
    
    public HistorialAsistenciaController(PanelHistorialAsistencia panelHistorialAsistencia){
        this.panelHistorialAsistencia = panelHistorialAsistencia;
        this.panelHistorialAsistencia.btnRefrescar.addActionListener(this);
        
        consultarAsistenciaDiaria(panelHistorialAsistencia.jTableHistorial);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == panelHistorialAsistencia.btnRefrescar){
            consultarAsistenciaDiaria(panelHistorialAsistencia.jTableHistorial);
            JOptionPane.showMessageDialog(panelHistorialAsistencia, "La tabla se ha actualizado correctamente.", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
     void consultarAsistenciaDiaria(JTable tablaAsitencia) {
        model.setRowCount(0);
        model = (DefaultTableModel) tablaAsitencia.getModel();
        tablaAsitencia.setModel(model);
        
        // Obtener ID de usuario
        Usuario user = Usuario.getInstance();
        int ID_Usuario = user.getID_Usuario();
        List<Empleado> lista = HistorialAsistenciaOp.SQL_ConsultarAsistenciaMensual(ID_Usuario);
        Object[] objeto = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getID_Asistecia();
            objeto[1] = lista.get(i).getFecha();
            objeto[2] = lista.get(i).getHoraEntrada();
            objeto[3] = lista.get(i).getHoraSalida();
            model.addRow(objeto);
        }

        // Establecer la altura de las filas
        tablaAsitencia.setRowHeight(30); // Ajusta este valor según tus necesidades

        // Aplicar el renderer a todas las columnas
        for (int i = 0; i < tablaAsitencia.getColumnCount(); i++) {
            tablaAsitencia.getColumnModel().getColumn(i).setCellRenderer(new CustomTableCellRenderer());
        }
    }

}
