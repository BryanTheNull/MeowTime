package Config;

import View.Login;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/**
 * @author bv587
 */
public class App {

    public static void main(String[] args) {
        
        // Iniciar Librerias necesarias
        FlatLightLaf.setup();
        MySQLConnection connection = MySQLConnection.getInstance();
        
        // Ruta de logo de MeowTime
        Image meowTime = new ImageIcon(App.class.getResource("/icons/logo_MeowTime 512x512.png")).getImage();
        
//        try {
//            Connection conn = connection.getConnection();
//            if (conn != null) {
//                // Mostrar la ventana de login si la conexión es exitosa
                Login login = new Login();
                login.setIconImage(meowTime);
                login.setVisible(true);
//                connection.closeConnection(conn);
//            }
//        } catch (SQLException e) {
            // Mostrar la ventana SinConexionMYSQL si la conexión falla
//            SinConexionMYSQL sinConexion = new SinConexionMYSQL();
//            sinConexion.setVisible(true);
//        }

    }
}
