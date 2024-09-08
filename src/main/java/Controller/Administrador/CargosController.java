package Controller.Administrador;

import Controller.*;
import View.Seguridad.PanelCambiarContraseña;
import View.Administrador.PanelAsistenciaDiaria;
import View.Administrador.PanelCargos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author The Chickens
 * @since 05-09-2024
 */
public class CargosController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private PanelCargos panelCargos;
    private CargosOperation cargosOp = new CargosOperation();
    
    public CargosController(PanelCargos panelCargos){
        this.panelCargos = panelCargos;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
