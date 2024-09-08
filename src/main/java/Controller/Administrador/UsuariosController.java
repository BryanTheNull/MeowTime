package Controller.Administrador;

import View.Administrador.PanelReportes;
import View.Administrador.PanelUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author The Chickens
 * @since 05-09-2024
 */
public class UsuariosController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private PanelUsuarios panelUsuarios;
    private UsuariosOperation usuariosOp = new UsuariosOperation();
    
    public UsuariosController(PanelUsuarios panelUsuarios){
        this.panelUsuarios = panelUsuarios;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
