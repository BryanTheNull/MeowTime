package Controller.Seguridad;

import Controller.Seguridad.*;
import View.Seguridad.PanelCambiarContraseña;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Model.Usuario;

/**
 * @author The Chickens
 * @since 05-09-2024
 */
public class CambiarContraseñaController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private PanelCambiarContraseña panelCambiarContraseña;
    private CambiarContraseñaOperation cambiarContraseñaOp = new CambiarContraseñaOperation();

    public CambiarContraseñaController(PanelCambiarContraseña panelCambiarContraseña) {
        this.panelCambiarContraseña = panelCambiarContraseña;
        this.panelCambiarContraseña.btnGuardarCambios.addActionListener(this);
        this.panelCambiarContraseña.btnCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelCambiarContraseña.btnGuardarCambios) {
            if (validarContraseñas()) {
                cambiarContraseña();
                panelCambiarContraseña.txtNuevaContraseña.setText("");
                panelCambiarContraseña.txtRepetirContraseña.setText("");
            } else {
                JOptionPane.showMessageDialog(panelCambiarContraseña, "Contraseñas inválidas", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (e.getSource() == panelCambiarContraseña.btnCancelar) {
            panelCambiarContraseña.txtNuevaContraseña.setText("");
            panelCambiarContraseña.txtRepetirContraseña.setText("");
        }
    }

    boolean validarContraseñas() {
        String Contraseña1 = panelCambiarContraseña.txtNuevaContraseña.getText();
        String Contraseña2 = panelCambiarContraseña.txtRepetirContraseña.getText();

        return Contraseña1.equals(Contraseña2);
    }

    void cambiarContraseña() {
        Usuario user = Usuario.getInstance();
        int ID_Usuario = user.getID_Usuario();
        String Contraseña = panelCambiarContraseña.txtNuevaContraseña.getText();
        int r = cambiarContraseñaOp.SQL_CambiarContraseña(ID_Usuario, Contraseña);
        if (r == 1) {
            JOptionPane.showMessageDialog(panelCambiarContraseña, "Contraseña Actualizada Exitosamente", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(panelCambiarContraseña, "Error", "Error al Cambiar Contraseña", JOptionPane.ERROR_MESSAGE);
        }
    }
}
