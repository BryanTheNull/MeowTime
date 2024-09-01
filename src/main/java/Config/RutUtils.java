package Config;

public class RutUtils {

    public static char calcularDigitoVerificador(String rut) {
        rut = rut.replaceAll("[^0-9]", ""); // Eliminar caracteres no numéricos
        int suma = 0;
        int peso = 2;

        // Iterar sobre los dígitos del RUT desde la derecha
        for (int i = rut.length() - 1; i >= 0; i--) {
            suma += Character.getNumericValue(rut.charAt(i)) * peso;
            peso++;
            if (peso > 7) {
                peso = 2;
            }
        }

        int residuo = suma % 11;
        int digito = 11 - residuo;

        // Determinar el dígito verificador
        if (digito == 11) {
            return '0';
        } else if (digito == 10) {
            return 'K';
        } else {
            return Character.forDigit(digito, 10);
        }
    }
}
