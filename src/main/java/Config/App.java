package Config;

import View.Login;
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author bv587
 */
public class App {

    public static void main(String[] args) {
        
        FlatLightLaf.setup();
        MySQLConnection connection = MySQLConnection.getInstance();
        
//        try {
//            Connection conn = connection.getConnection();
//            if (conn != null) {
//                // Mostrar la ventana de login si la conexión es exitosa
                Login login = new Login();
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
