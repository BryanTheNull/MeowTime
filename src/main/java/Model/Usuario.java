package Model;

/**
 * @author Bryan Vera
 * @since 20-08-2024
 * @version 1.0
 */
public class Usuario {

    // Atributos de la clase
    private int ID_Usuario;
    private String Cargo;
    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private String Rut;
    private String Email;
    private String FechaRegistro;

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

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(String FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }
    
    public static void updateInstance(int ID_Usuario, String cargo, String primerNombre, String segundoNombre,
                                      String primerApellido, String segundoApellido, 
                                      String rut,String email, String fechaRegistro) {
        Usuario user = getInstance();
        user.setID_Usuario(ID_Usuario);
        user.setCargo(cargo);
        user.setPrimerNombre(primerNombre);
        user.setSegundoNombre(segundoNombre);
        user.setPrimerApellido(primerApellido);
        user.setSegundoApellido(segundoApellido);
        user.setRut(rut);
        user.setEmail(email);
        user.setFechaRegistro(fechaRegistro);
    }

   
}
