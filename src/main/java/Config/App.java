package Config;

import View.Login.Login;
import com.formdev.flatlaf.FlatLightLaf;

/**
 * @author The Chickens
 * @since 27-08-2024
 */
public class App {

    public static void main(String[] args) {
        
        // Iniciar Librerias necesarias
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
