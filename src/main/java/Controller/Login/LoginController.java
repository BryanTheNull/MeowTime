package Controller.Login;

import Model.Usuario;
import View.PanelesAdministrador.AdministrarAsistencia;
import View.Login;
import View.PanelesUsuario.RegistrarAsistencia;
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
    private String cargoObtenido;

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
            if (verificarContraseña()) {
                obtenerDatosAcceso();

                if (cargoObtenido.equals("Administrador")) {
                    accederAdministrador();
                } else {
                    accederUsuario();
                }

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

    boolean verificarContraseña() {
        String emailIngresado = login.txtEmail.getText();
        String contraseñaIngresada = login.txtContraseña.getText();

        boolean accesoPermitido = loginOp.SQL_VerificarContraseña(emailIngresado, contraseñaIngresada);

        if (accesoPermitido) {
            emailObtenido = emailIngresado;
            return true;
        } else {
            intentosRealizados++;
            if (intentosRealizados < intentosMax) {
                JOptionPane.showMessageDialog(login, "Contraseña incorrecta. Intento " + intentosRealizados + " de " + intentosMax, "Contraseña incorrecta", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(login, "Se ha excedido el número máximo de intentos. La ventana se cerrará.", "Intentos excedidos", JOptionPane.ERROR_MESSAGE);
                login.dispose();
            }
        }
        return false;
    }

    void obtenerDatosAcceso() {
        loginOp.SQL_ObtenerDatosUsuario(emailObtenido);
        Usuario usuario = Usuario.getInstance();
        cargoObtenido = usuario.getCargo();
    }

    public RegistrarAsistencia accederUsuario() {
        RegistrarAsistencia registrarAsistencia = new RegistrarAsistencia();
        registrarAsistencia.setVisible(true);
        login.dispose();
        return registrarAsistencia;
    }

    public AdministrarAsistencia accederAdministrador() {
        AdministrarAsistencia administrarAsistencia = new AdministrarAsistencia();
        administrarAsistencia.setVisible(true);
        login.dispose();
        return administrarAsistencia;
    }
}
