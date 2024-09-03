package Controller.Login;

import Config.MySQLConnection;
import Config.PasswordUtils;
import Model.Usuario;
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

    public boolean SQL_VerificarContraseña(String v_Email, String v_Contraseña) {
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT Contraseña FROM Usuarios WHERE Email = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, v_Email);
            rs = ps.executeQuery();

            if (rs.next()) {
                String contraseñaAlmacenada = rs.getString("Contraseña");
                if (PasswordUtils.checkPassword(v_Contraseña, contraseñaAlmacenada)) {
                    return true;
                }
            }
            dbConnection.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Usuario SQL_ObtenerDatosUsuario(String v_Email) {
        Usuario usuario = null;
        String sql = "SELECT (SELECT Nombre FROM Cargos WHERE ID_Cargo = usuarios.ID_Cargo) AS Cargo ,PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Rut,  Email, Fecha_Registro FROM Usuarios WHERE Email=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v_Email);

            rs = ps.executeQuery();

            if (rs.next()) {
                String cargo = rs.getString("Cargo");
                String nombre = rs.getString("PrimerNombre");
                String segundoNombre = rs.getString("SegundoNombre");
                if(segundoNombre == null){
                    segundoNombre = "";
                }
                String apellido = rs.getString("PrimerApellido");
                String segundoApellido = rs.getString("SegundoApellido");
                if(segundoApellido == null){
                    segundoApellido = "";
                }
                String rut = rs.getString("Rut");
                String email = rs.getString("Email");
                String fechaRegistro = rs.getString("Fecha_Registro");

                Usuario.updateInstance(cargo, nombre, segundoNombre, apellido, segundoApellido, rut, email, fechaRegistro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

}
