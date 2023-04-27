
package Extras;

public class Extra12Chargt {

    
    public static void main(String[] args) {
           for (int i = 0; i <= 999; i++) {
            String numero = String.format("%03d", i); // asegurarse de que el número tenga 3 dígitos
            if (numero.contains("3")) {
                numero = numero.replace("3", "E"); // sustituir el 3 por una E
            }
            System.out.println(numero.charAt(0) + "-" + numero.charAt(1) + "-" + numero.charAt(2));
        }
    }
}