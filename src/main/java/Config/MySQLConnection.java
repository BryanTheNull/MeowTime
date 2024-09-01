package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConnection {
    // Datos para establecer la conexion.
    private static final String IP = "127.0.0.1";
    private static final String BD = "MeowTime";
    private static final String URL = "jdbc:mysql://" + IP + ":3306/" + BD;
    private static final String USER = "root";
    private static final String PASS = "";
    
    // Singleton instance
    private static MySQLConnection instance = null;
   
    // Constructor de la clase
    private MySQLConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    // Metodo para instanciar clase
    public static MySQLConnection getInstance(){
        if(instance == null){
            instance = new MySQLConnection();
        }
        return instance;
    }
    
    // Metodo para establecer conexion a la base de datos
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER , PASS);
    }
    
    // Metodo para cerrar conexion a la base de datos
    public void closeConnection(Connection conn){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
