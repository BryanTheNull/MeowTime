package Controller.Administrador;

import Config.CustomTableCellRenderer;
import Model.Empleado;
import View.Administrador.PanelAsistenciaDiaria;
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
public class AsistenciaDiariaController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private PanelAsistenciaDiaria panelAsistenciaDiaria;
    private AsistenciaDiariaOperation asistenciaDiariaOp = new AsistenciaDiariaOperation();

    // Iniciar clase Model de Empleado y tabla por defecto
    DefaultTableModel model = new DefaultTableModel();
    Empleado e = new Empleado();

    public AsistenciaDiariaController(PanelAsistenciaDiaria panelAsistenciaDiaria) {
        this.panelAsistenciaDiaria = panelAsistenciaDiaria;
        this.panelAsistenciaDiaria.btnRefrescar.addActionListener(this);

        // Consultar al inicar Contructor
        consultarAsistenciaDiaria(panelAsistenciaDiaria.jTableAsistenciaDiaria);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelAsistenciaDiaria.btnRefrescar) {
            consultarAsistenciaDiaria(panelAsistenciaDiaria.jTableAsistenciaDiaria);
            JOptionPane.showMessageDialog(panelAsistenciaDiaria, "La tabla se ha actualizado correctamente.", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    void consultarAsistenciaDiaria(JTable tablaAsitencia) {
        model.setRowCount(0);
        model = (DefaultTableModel) tablaAsitencia.getModel();
        tablaAsitencia.setModel(model);
        List<Empleado> lista = asistenciaDiariaOp.SQL_ConsultarAsistenciaDiaria();
        Object[] objeto = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getID_Empleado();
            objeto[1] = lista.get(i).getPrimerNombre();
            objeto[2] = lista.get(i).getRut();
            objeto[3] = lista.get(i).getCargo();
            objeto[4] = lista.get(i).getHoraEntrada();
            objeto[5] = lista.get(i).getHoraSalida();

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
