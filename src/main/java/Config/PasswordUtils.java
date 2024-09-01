package Config;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtils {
    
    public static String hashPassword(String v_PasswordEntered){
        return BCrypt.hashpw(v_PasswordEntered, BCrypt.gensalt());
    }
    
    public static boolean checkPassword(String v_PasswordEntered, String v_PasswordHashed){
        return BCrypt.checkpw(v_PasswordEntered, v_PasswordHashed);
    }
}
