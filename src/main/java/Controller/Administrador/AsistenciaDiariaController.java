package Controller.Administrador;

import Controller.*;
import View.Seguridad.PanelCambiarContraseña;
import View.Administrador.PanelAsistenciaDiaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author The Chickens
 * @since 05-09-2024
 */
public class AsistenciaDiariaController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private PanelAsistenciaDiaria panelAsistenciaDiaria;
    private AsistenciaDiariaOperation asistenciaDiariaOp = new AsistenciaDiariaOperation();
    
    public AsistenciaDiariaController(PanelAsistenciaDiaria panelAsistenciaDiaria){
        this.panelAsistenciaDiaria = panelAsistenciaDiaria;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
