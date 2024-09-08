package Controller.Administrador;

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
public class AsistenciaDiariaOperation {

    // Preparar variables 
    PreparedStatement ps;
    ResultSet rs;
    Connection con;

    // Instanciar la conexiona a la base de datos
    MySQLConnection dbConnection = MySQLConnection.getInstance();

    public List SQL_ConsultarAsistenciaDiaria() {
        List<Empleado> DatosAsistencia = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT A.ID_Asistencia,\n"
                    + "	   CONCAT(U.PrimerNombre, ' ' ,SegundoNombre) AS NombreCompleto,\n"
                    + "       U.Rut,\n"
                    + "       (SELECT Nombre FROM Cargos WHERE ID_Cargo = U.ID_Cargo) AS NombreCargo,\n"
                    + "       A.Entrada,\n"
                    + "       A.Salida\n"
                    + "FROM Asistencias A \n"
                    + "JOIN Usuarios U ON A.ID_Usuario = U.ID_Usuario\n"
                    + "WHERE A.Fecha = CURDATE()";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado e = new Empleado();
                e.setID_Empleado(rs.getInt(1));
                e.setPrimerNombre(rs.getString(2));
                e.setRut(rs.getString(3));
                e.setCargo(rs.getString(4));
                e.setHoraEntrada(rs.getString(5));
                e.setHoraSalida(rs.getString(6));
                DatosAsistencia.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosAsistencia;
    }
}
