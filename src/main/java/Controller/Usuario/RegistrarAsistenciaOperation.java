package Controller.Usuario;

import Config.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Bryan Vera
 * @since 03-09-2024
 */
public class RegistrarAsistenciaOperation {

    // Preparar variables 
    PreparedStatement ps;
    ResultSet rs;
    Connection con;

    // Instanciar la conexiona a la base de datos
    MySQLConnection dbConnection = MySQLConnection.getInstance();

    public boolean SQL_VerificarEntrada(int ID_Usuario) {
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT Entrada FROM Asistencias WHERE ID_Usuario =? AND Fecha = CURDATE()";
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Usuario);

            rs = ps.executeQuery();

            if (rs.next()) {
                String horaEntrada = rs.getString(1);
             
                // Si la columna "Entrada" retorna vacia o null
                if (horaEntrada == null || horaEntrada.trim().isEmpty()) {
                    return false;   // No hay entrada registrada
                } else {
                    return true;    // Ya tiene entrada registrada
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public int SQL_RegistrarAsistencia(String v_Sql, int v_ID_Usuario) {
        int r = 0;
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(v_Sql);
            ps.setInt(1, v_ID_Usuario);

            r = ps.executeUpdate();

            dbConnection.closeConnection(con);
            
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;
    }

}
