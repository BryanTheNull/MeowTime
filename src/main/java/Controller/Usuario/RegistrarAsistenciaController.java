package Controller.Usuario;

import Model.Usuario;
import View.PanelesUsuario.PanelRegistrarAsistencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Bryan Vera
 * @since 02-09-2024
 */

public class RegistrarAsistenciaController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private PanelRegistrarAsistencia panelRegistrarAsistencia;

    public RegistrarAsistenciaController(PanelRegistrarAsistencia panelRegistrarAsistencia) {
        this.panelRegistrarAsistencia = panelRegistrarAsistencia;
        this.panelRegistrarAsistencia.btnRegistrarAsistencia.addActionListener(this);
        
        
        // Cargar datos al iniciar el constructor
        obtenerDatosUsuario();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    void obtenerDatosUsuario(){
        Usuario user = Usuario.getInstance();
        panelRegistrarAsistencia.txtNombre.setText(user.getPrimerNombre() + " " + user.getSegundoNombre());
        panelRegistrarAsistencia.txtApellido.setText(user.getPrimerApellido()+ " " + user.getSegundoApellido());
        panelRegistrarAsistencia.txtRut.setText(user.getRut());
        panelRegistrarAsistencia.txtEmail.setText(user.getEmail());
        panelRegistrarAsistencia.txtCargo.setText(user.getCargo());
    }

}
