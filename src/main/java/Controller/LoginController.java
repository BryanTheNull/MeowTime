package Controller;

import View.Login;
import View.RegistrarAsistencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * @author Bryan Vera
 * @since 30-08-2024
 */
public class LoginController implements ActionListener {

    // Inicializar vista del controllador y sus operaciones
    private Login login;
    private LoginOperation loginOp = new LoginOperation();

    // Variables globales
    private String emailObtenido;
    private int intentosRealizados = 0;
    private static final int intentosMax = 3;

    // Crear constructor del controlador
    public LoginController(Login login) {
        this.login = login;
        this.login.btnIniciarSesion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.btnIniciarSesion) {
            if (!validarCamposLogin()) {
                return;
            }

            if (!verificarExistenciaEmail()) {
                return;
            }
            
            
        }
    }

    boolean validarCamposLogin() {
        String email = login.txtEmail.getText();
        String contraseña = login.txtContraseña.getText();

        // Validar campos de email
        if (!verificarFormatoCorreo(email)) {
            JOptionPane.showMessageDialog(login, "El formato del correo electrónico es inválido.", "Error: Correo inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Verificar campos de contraseña
        if (contraseña.equals("Contraseña") || contraseña.isEmpty() || contraseña.equals("")) {
            JOptionPane.showMessageDialog(login, "La contraseña esta vacia.", "Error: Contraseña en blanco", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    boolean verificarExistenciaEmail() {
        // Obtener el texto del campo de email
        String email = login.txtEmail.getText().trim();

        int resultado = loginOp.SQL_VerificarExistenciaUsuario(email);
        if (resultado != 1) {
            JOptionPane.showMessageDialog(login, "El correo electrónico no se encuentra registrado.", "Correo electrónico no registrado", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    boolean verificarFormatoCorreo(String v_Correo) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(v_Correo);
        if (matcher.matches() == true) {
            return true;
        }
        return false;
    }
    
    boolean verificarContraseña(){
        
        return true;
    }
    
    public RegistrarAsistencia accederUsuario(){
        
        
        return null;
        
    }
    
   
}
