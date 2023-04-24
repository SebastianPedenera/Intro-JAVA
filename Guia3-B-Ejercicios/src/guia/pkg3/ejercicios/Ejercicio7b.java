
package guia.pkg3.ejercicios;

import java.util.Scanner;

public class Ejercicio7b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                String secuencia;
        int lectInc = 0;
        int lectCorr = 0;
        do {            
            System.out.println("Ingrese la secuencia");
            secuencia = sc.next();
            //System.out.println("La secuencia original es: " + secuencia);
            if (secuencia.equals("&&&&&")) {
                System.out.println("Secuencia final FDE");
                break;
            } else if (secuencia.length() > 5) {
                lectInc++;
                System.out.println("Secuencia mayor a 5 caracteres");
            } else if (secuencia.substring(0, 1).equals("X") && secuencia.substring(4, 5).equals("O")) {
                lectCorr++;
                System.out.println("Secuencia correcta");
            } else {
                lectInc++;
                System.out.println("Secuencia debe comenzar con X y terminar con O");
            }
        } while (true);
        System.out.println("Lecturas correctas: " + lectCorr);
        System.out.println("Lecturas incorrectas: " + lectInc);
    }
}
