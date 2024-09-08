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
public class UsuariosOperation {

    // Preparar variables 
    PreparedStatement ps;
    ResultSet rs;
    Connection con;

    // Instanciar la conexiona a la base de datos
    MySQLConnection dbConnection = MySQLConnection.getInstance();

    public List SQL_ConsultarUsuarios() {
        List<Empleado> DatosUsuarios = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT ID_Usuario,\n"
                    + "       CONCAT(PrimerNombre, ' ', COALESCE(SegundoNombre, '')) AS Nombres,\n"
                    + "       CONCAT(PrimerApellido, ' ', COALESCE(SegundoApellido, '')) AS Apellidos,\n"
                    + "       (SELECT Nombre FROM Cargos WHERE ID_Cargo = Usuarios.ID_Cargo) AS Cargo,\n"
                    + "       Rut,\n"
                    + "       Email,\n"
                    + "       Fecha_Registro\n"
                    + "FROM Usuarios";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado e = new Empleado();
                e.setID_Empleado(rs.getInt(1));
                e.setPrimerNombre(rs.getString(2));
                e.setPrimerApellido(rs.getString(3));
                e.setCargo(rs.getString(4));
                e.setEmail(rs.getString(5));
                e.setFechaRegistro(rs.getString(6));
                DatosUsuarios.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosUsuarios;
    }
}
