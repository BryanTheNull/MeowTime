package Controller;

import Config.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Bryan Vera
 * @since 30-08-2024
 */

public class LoginOperation {
    
    // Preparar variables 
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    
    // Instanciar la conexiona a la base de datos
    MySQLConnection dbConnection = MySQLConnection.getInstance();
    
      public int SQL_VerificarExistenciaUsuario(String v_Email) {
        int r = 0;
        try {
            con = dbConnection.getConnection(); // Conectar con la bd
            String sql = "SELECT COUNT(*) FROM Usuarios WHERE Email =?";
            ps = con.prepareStatement(sql);
            ps.setString(1, v_Email);   // Pasar parametros a consulta sql

            rs = ps.executeQuery(); // Ejecutar consulta sql

            // Verificar si el usuario existe
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    r = 1; // El usuario existe
                }
            }
            // Cerrar coneccion
            dbConnection.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;
    }

}
