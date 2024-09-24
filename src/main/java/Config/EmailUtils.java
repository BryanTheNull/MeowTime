package Config;

/**
 * @author The Chickens
 * @since 23-09-2024
 */
public class EmailUtils {

    public static boolean verificarFormatoEmail(String email) {
        // Expresión regular para el formato de email xxxx@xxxx.xx
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        // Comprobamos si el formato del Email es valido
        return email.matches(regex);
    }
}
