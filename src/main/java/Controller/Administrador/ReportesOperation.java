package Controller.Administrador;

import Config.MySQLConnection;
import Model.Reporte;
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
public class ReportesOperation {

    // Preparar variables 
    PreparedStatement ps;
    ResultSet rs;
    Connection con;

    // Instanciar la conexiona a la base de datos
    MySQLConnection dbConnection = MySQLConnection.getInstance();

    public List SQL_ConsultarReporte1(String v_SQL) {
        List<Reporte> DatosReporte = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(v_SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                Reporte r = new Reporte();
                r.setID_Usuario(rs.getInt(1));
                r.setPrimerNombre(rs.getString(2));
                r.setSegundoNombre(rs.getString(3));
                r.setPrimerApellido(rs.getString(4));
                r.setSegundoApellido(rs.getString(5));
                r.setFecha(rs.getString(6));
                r.setEntrada(rs.getString(7));
                DatosReporte.add(r);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosReporte;
    }

    public List SQL_ConsultarReporte2(String v_SQL) {
        List<Reporte> DatosReporte = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(v_SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                Reporte r = new Reporte();
                r.setID_Usuario(rs.getInt(1));
                r.setPrimerNombre(rs.getString(2));
                r.setSegundoNombre(rs.getString(3));
                r.setPrimerApellido(rs.getString(4));
                r.setSegundoApellido(rs.getString(5));
                r.setFecha(rs.getString(6));
                r.setSalida(rs.getString(7));
                DatosReporte.add(r);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosReporte;
    }

    public List SQL_ConsultarReporte3(String v_SQL) {
        List<Reporte> DatosReporte = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(v_SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                Reporte r = new Reporte();
                r.setID_Usuario(rs.getInt(1));
                r.setPrimerNombre(rs.getString(2));
                r.setSegundoNombre(rs.getString(3));
                r.setPrimerApellido(rs.getString(4));
                r.setSegundoApellido(rs.getString(5));
                DatosReporte.add(r);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosReporte;
    }

}
