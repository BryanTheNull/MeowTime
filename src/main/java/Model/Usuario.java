package Model;

/**
 * @author Bryan Vera
 * @since 20-08-2024
 * @version 1.0
 */

public class Usuario {
    
    // Atributos de la clase
    private int ID_Usuario;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Contraseña;
    private String Fecha_Ingreso;
    private String Fecha_Salida;
    private String Rango;

    // Instancia unica de singleton
    private static Usuario instance;
    
    // Constructor vacio
    private Usuario() {
    }
    
    // Método estático para obtener la instancia única
    public static Usuario getInstance() {
        if (instance == null) {
            instance = new Usuario();
        }
        return instance;
    }
    
    // Getter and Setter

    public int getID_Usuario() {
        return ID_Usuario;
    }
    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getContraseña() {
        return Contraseña;
    }
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    public String getFecha_Ingreso() {
        return Fecha_Ingreso;
    }
    public void setFecha_Ingreso(String Fecha_Ingreso) {
        this.Fecha_Ingreso = Fecha_Ingreso;
    }
    public String getFecha_Salida() {
        return Fecha_Salida;
    }
    public void setFecha_Salida(String Fecha_Salida) {
        this.Fecha_Salida = Fecha_Salida;
    }
    public String getRango() {
        return Rango;
    }
    public void setRango(String Rango) {
        this.Rango = Rango;
    }   
}