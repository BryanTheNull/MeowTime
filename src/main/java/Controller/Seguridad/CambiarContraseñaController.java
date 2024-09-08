package Controller.Seguridad;

import View.Seguridad.PanelCambiarContraseña;
import Controller.Seguridad.CambiarContraseñaOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author The Chickens
 * @since 05-09-2024
 */
public class CambiarContraseñaController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private PanelCambiarContraseña panelCambiarContraseña;
    private CambiarContraseñaOperation cambiarContraseñaOp = new CambiarContraseñaOperation();
    
    public CambiarContraseñaController(PanelCambiarContraseña panelCambiarContraseña){
        this.panelCambiarContraseña = panelCambiarContraseña;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
