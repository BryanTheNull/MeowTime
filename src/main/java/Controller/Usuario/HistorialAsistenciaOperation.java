package Controller.Usuario;

import Config.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author The Chickens
 * @since 05-09-2024
 */
public class HistorialAsistenciaOperation {

    // Preparar variables 
    PreparedStatement ps;
    ResultSet rs;
    Connection con;

    // Instanciar la conexiona a la base de datos
    MySQLConnection dbConnection = MySQLConnection.getInstance();
}
