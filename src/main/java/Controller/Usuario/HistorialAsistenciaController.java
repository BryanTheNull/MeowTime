package Controller.Usuario;

import View.Usuario.PanelHistorialAsistencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Bryan Vera
 * @since 05-09-2024
 */
public class HistorialAsistenciaController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private PanelHistorialAsistencia panelHistorialAsistencia;
    private HistorialAsistenciaOperation HistorialAsistenciaOp = new HistorialAsistenciaOperation();
    
    public HistorialAsistenciaController(PanelHistorialAsistencia panelHistorialAsistencia){
        this.panelHistorialAsistencia = panelHistorialAsistencia;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
