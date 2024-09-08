package Controller.Administrador;

import View.Administrador.PanelReportes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author The Chickens
 * @since 05-09-2024
 */
public class ReportesController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private PanelReportes panelReportes;
    private ReportesOperation reportesOp = new ReportesOperation();
    
    public ReportesController(PanelReportes panelReportes){
        this.panelReportes = panelReportes;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
