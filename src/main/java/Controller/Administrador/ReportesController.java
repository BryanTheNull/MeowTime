package Controller.Administrador;

import Model.Reporte;
import View.Administrador.PanelReportes;
import View.Reportes.Reporte1;
import View.Reportes.Reporte2;
import View.Reportes.Reporte3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author The Chickens
 * @since 05-09-2024
 */
public class ReportesController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private PanelReportes panelReportes;
    private ReportesOperation reportesOp = new ReportesOperation();
    DefaultTableModel modelo = new DefaultTableModel();

    // Variables globales}
    String consultaSQL = "";
    String nombreReporte = "";

    public ReportesController(PanelReportes panelReportes) {
        this.panelReportes = panelReportes;
        this.panelReportes.jComboBoxSeleccionarTipoReporte.addActionListener(this);
        this.panelReportes.btnGenerarReporte.addActionListener(this);

        panelReportes.jComboBoxSeleccionarTipoReporte.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelReportes.jComboBoxSeleccionarTipoReporte) {
            int NumeroReporte = panelReportes.jComboBoxSeleccionarTipoReporte.getSelectedIndex() + 1;

            switch (NumeroReporte) {
                case 1:
                    panelReportes.jTextAreaDescripcion.setText("Este reporte muestra a todos los empleados que registraron su entrada después de las 9:30 am. Según las políticas de la empresa, cualquier entrada posterior a esta hora es considerada como \"entrada atrasada\". El reporte incluye la fecha y hora de entrada de cada empleado que ha incumplido este horario.");
                    nombreReporte = panelReportes.jComboBoxSeleccionarTipoReporte.getSelectedItem().toString();
                    consultaSQL = "SELECT U.ID_Usuario, U.PrimerNombre, U.SegundoNombre, U.PrimerApellido, U.SegundoApellido, A.Fecha, A.Entrada\n"
                            + "FROM Usuarios U\n"
                            + "JOIN Asistencias A ON U.ID_Usuario = A.ID_Usuario\n"
                            + "WHERE A.Entrada > '09:30:00'";
                    break;
                case 2:
                    panelReportes.jTextAreaDescripcion.setText("Este reporte detalla a todos los empleados que registraron su salida antes de las 17:30 pm. Salir antes de esta hora se considera como una \"salida anticipada\" y puede afectar el rendimiento laboral. El reporte incluye la fecha y hora de salida de cada empleado que salió antes de tiempo.");
                    nombreReporte = panelReportes.jComboBoxSeleccionarTipoReporte.getSelectedItem().toString();
                    consultaSQL = "SELECT U.ID_Usuario, U.PrimerNombre, U.SegundoNombre, U.PrimerApellido, U.SegundoApellido, A.Fecha, A.Salida\n"
                            + "FROM Usuarios U\n"
                            + "JOIN Asistencias A ON U.ID_Usuario = A.ID_Usuario\n"
                            + "WHERE A.Salida < '17:30:00'";
                    break;
                case 3:
                    panelReportes.jTextAreaDescripcion.setText("Este reporte presenta a todos los empleados que no registraron ni entrada ni salida en un día específico, lo que indica una posible inasistencia. Puede usarse para gestionar ausencias laborales y revisar quiénes no se presentaron a trabajar.");
                    nombreReporte = panelReportes.jComboBoxSeleccionarTipoReporte.getSelectedItem().toString();
                    consultaSQL = "SELECT U.ID_Usuario, U.PrimerNombre, U.SegundoNombre, U.PrimerApellido, U.SegundoApellido\n"
                            + "FROM Usuarios U\n"
                            + "LEFT JOIN Asistencias A ON U.ID_Usuario = A.ID_Usuario AND A.Fecha = CURDATE()\n"
                            + "WHERE A.ID_Asistencia IS NULL";
                    break;

            }
        }

        if (e.getSource() == panelReportes.btnGenerarReporte) {
            int NumeroReporte = panelReportes.jComboBoxSeleccionarTipoReporte.getSelectedIndex() + 1;
            switch (NumeroReporte) {
                case 1:
                    Reporte1 reporte1 = new Reporte1();
                    generarReporte1(consultaSQL, reporte1.jTableReporte1);
                    reporte1.setTitle(nombreReporte);
                    reporte1.setLocationRelativeTo(null);
                    reporte1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    reporte1.setVisible(true);
                    break;
                case 2:
                    Reporte2 reporte2 = new Reporte2();
                    generarReporte2(consultaSQL, reporte2.jTableReporte2);
                    reporte2.setTitle(nombreReporte);
                    reporte2.setLocationRelativeTo(null);
                    reporte2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    reporte2.setVisible(true);
                    break;
                case 3:
                    Reporte3 reporte3 = new Reporte3();
                    generarReporte3(consultaSQL, reporte3.jTableReporte3);
                    reporte3.setTitle(nombreReporte);
                    reporte3.setLocationRelativeTo(null);
                    reporte3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    reporte3.setVisible(true);
                    break;
            }
        }
    }

    public void generarReporte1(String v_SQL, JTable tablaReporte) {
        modelo = (DefaultTableModel) tablaReporte.getModel();
        tablaReporte.setModel(modelo);
        List<Reporte> lista = reportesOp.SQL_ConsultarReporte1(v_SQL);
        Object[] objeto = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getID_Usuario();
            objeto[1] = lista.get(i).getPrimerNombre();
            objeto[2] = lista.get(i).getSegundoNombre();
            objeto[3] = lista.get(i).getPrimerApellido();
            objeto[4] = lista.get(i).getSegundoApellido();
            objeto[5] = lista.get(i).getFecha();
            objeto[6] = lista.get(i).getEntrada();
            modelo.addRow(objeto);
        }
    }

    public void generarReporte2(String v_SQL, JTable tablaReporte) {
        modelo = (DefaultTableModel) tablaReporte.getModel();
        tablaReporte.setModel(modelo);
        List<Reporte> lista = reportesOp.SQL_ConsultarReporte2(v_SQL);
        Object[] objeto = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getID_Usuario();
            objeto[1] = lista.get(i).getPrimerNombre();
            objeto[2] = lista.get(i).getSegundoNombre();
            objeto[3] = lista.get(i).getPrimerApellido();
            objeto[4] = lista.get(i).getSegundoApellido();
            objeto[5] = lista.get(i).getFecha();
            objeto[6] = lista.get(i).getSalida();
            modelo.addRow(objeto);
        }
    }

    public void generarReporte3(String v_SQL, JTable tablaReporte) {
        modelo = (DefaultTableModel) tablaReporte.getModel();
        tablaReporte.setModel(modelo);
        List<Reporte> lista = reportesOp.SQL_ConsultarReporte3(v_SQL);
        Object[] objeto = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getID_Usuario();
            objeto[1] = lista.get(i).getPrimerNombre();
            objeto[2] = lista.get(i).getSegundoNombre();
            objeto[3] = lista.get(i).getPrimerApellido();
            objeto[4] = lista.get(i).getSegundoApellido();
            modelo.addRow(objeto);
        }
    }
}
