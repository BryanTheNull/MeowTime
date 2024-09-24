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

    public int SQL_EliminarUsuario(int ID_Usuario) {
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

    public List SQL_ConsultarNombresCargos() {
        List<String> DatosNombresCargos = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT Nombre FROM Cargos";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DatosNombresCargos.add(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosNombresCargos;
    }

    public int SQL_AgregarNuevoUsuario(Empleado e) {
        int r = 0;
        String sql = "INSERT INTO Usuarios (ID_Cargo ,PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Rut, Email, Contraseña) \n"
                + "VALUES ((SELECT ID_Cargo From Cargos WHERE Nombre = ? ),?,?,?,?,?,?,?);";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, e.getCargo());
            ps.setString(2, e.getPrimerNombre());

            if (e.getSegundoNombre() != null) {
                ps.setString(3, e.getSegundoNombre());
            } else {
                ps.setNull(3, java.sql.Types.VARCHAR); // Si no hay segundo nombre, insertar NULL
            }

            ps.setString(4, e.getPrimerApellido());

            // Si el SegundoApellido es nulo, insertar null
            if (e.getSegundoApellido() != null) {
                ps.setString(5, e.getSegundoApellido());
            } else {
                ps.setNull(5, java.sql.Types.VARCHAR); // Si no hay segundo apellido, insertar NULL
            }

            ps.setString(6, e.getRut());
            ps.setString(7, e.getEmail());
            ps.setString(8, e.getContraseña());

            // Ejecutar la actualización
            r = ps.executeUpdate();

            // Verificar el resultado
            if (r == 1) {
                return 1; // Se ha insertado correctamente
            } else {
                return 0; // No se ha insertado
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }
        return r;
    }

    public int SQL_ActualizarUsuario(Empleado e) {
        int r = 0;
        String sql = "UPDATE Usuarios SET Cargo = (SELECT ID_Cargo FROM Cargos WHERE Nombre=?), "
                + "PrimerNombre =?, SegundoNombre=?, PrimerApellido=?, SegundoApellido=?, Rut = ?, Email=? "
                + "WHERE ID_Usuario=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, e.getCargo());
            ps.setString(2, e.getPrimerNombre());
            if (e.getSegundoNombre() != null) {
                ps.setString(3, e.getSegundoNombre());
            } else {
                ps.setNull(3, java.sql.Types.VARCHAR); // Si no hay segundo nombre, insertar NULL
            }
            ps.setString(4, e.getPrimerApellido());
            // Si el SegundoApellido es nulo, insertar null
            if (e.getSegundoApellido() != null) {
                ps.setString(5, e.getSegundoApellido());
            } else {
                ps.setNull(5, java.sql.Types.VARCHAR); // Si no hay segundo apellido, insertar NULL
            }
            ps.setString(6, e.getRut());
            ps.setString(7, e.getEmail());
            ps.setInt(8, e.getID_Empleado());

            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }

        } catch (SQLException err) {
            err.printStackTrace();
        }
        return r;
    }

    public String SQL_ConsultarContraseña(int ID_Usuario) {
        String contraseña = null;
        String sql = "SELECT Contraseña FROM Usuarios WHERE ID_Usuario = ?";

        try {
            con = dbConnection.getConnection();  // Obtén la conexión a la base de datos
            ps = con.prepareStatement(sql);      // Prepara la consulta SQL
            ps.setInt(1, ID_Usuario);             // Establece el parámetro del ID de usuario

            rs = ps.executeQuery();              // Ejecuta la consulta

            if (rs.next()) {
                contraseña = rs.getString("Contraseña");  // Obtén la contraseña si el usuario existe
            }

        } catch (SQLException err) {
            err.printStackTrace();
        }

        return contraseña;  // Devuelve la contraseña (o null si no se encontró el usuario)
    }
}
