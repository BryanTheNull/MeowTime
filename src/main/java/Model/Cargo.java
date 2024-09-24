package Model;

/**
 * @author The Chickens
 * @since 10-09-2024
 */

public class Cargo {
   // Atributos de la clase
    private int ID_Cargo;
    private String Nombre;
    private String Descripcion;

    public Cargo() {
    }

    public int getID_Cargo() {
        return ID_Cargo;
    }

    public void setID_Cargo(int ID_Cargo) {
        this.ID_Cargo = ID_Cargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
