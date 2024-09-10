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
                e.setRut(rs.getString(5));
                e.setEmail(rs.getString(6));
                e.setFechaRegistro(rs.getString(7));
                DatosUsuarios.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosUsuarios;
    }
    
     public int SQL_EliminarUsuario(int ID_Usuario){
        int r = 0;
        String sql = "DELETE FROM Usuarios WHERE ID_Usuario=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Usuario);
            r = ps.executeUpdate();

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
