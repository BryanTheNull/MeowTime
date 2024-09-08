package Controller.Seguridad;

import Controller.Seguridad.*;
import Config.MySQLConnection;
import Config.PasswordUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author The Chickens
 * @since 05-09-2024
 */
public class CambiarContraseñaOperation {

    // Preparar variables 
    PreparedStatement ps;
    ResultSet rs;
    Connection con;

    // Instanciar la conexiona a la base de datos
    MySQLConnection dbConnection = MySQLConnection.getInstance();
    
    public int SQL_CambiarContraseña(int ID_Usuario, String Contraseña){
        int r = 0;
        String sql = "UPDATE usuarios SET Contraseña = ? WHERE ID_Usuario = ?";
         try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, PasswordUtils.hashPassword(Contraseña));
            ps.setInt(2, ID_Usuario);
            r = ps.executeUpdate();
            if (r == 1){
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
        }
        return r;
    }
}
