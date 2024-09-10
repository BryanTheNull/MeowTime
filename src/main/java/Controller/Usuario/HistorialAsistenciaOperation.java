package Controller.Usuario;

import Config.MySQLConnection;
import Model.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public List SQL_ConsultarAsistenciaMensual(int ID_Usuario) {
        List<Empleado> DatosHistorial = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT ID_Asistencia, Fecha, Entrada, Salida FROM Asistencias WHERE MONTH(Fecha) = MONTH(CURDATE()) AND YEAR(Fecha) = YEAR(CURDATE()) AND ID_Usuario = ?";

            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Usuario);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado e = new Empleado();
                e.setID_Asistecia(rs.getInt(1));
                e.setFecha(rs.getString(2));
                e.setHoraEntrada(rs.getString(3));
                e.setHoraSalida(rs.getString(4));
                DatosHistorial.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosHistorial;
    }
}
