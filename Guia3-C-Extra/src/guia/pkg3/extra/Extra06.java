/*

 */
package guia.pkg3.extra;

import java.util.Scanner;

public class Extra06 {

    public static void main(String[] args) {
        int contM = 0, contG = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int personas = sc.nextInt();        
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la " + i + " persona");
            double alturas = sc.nextDouble();
            if (alturas > 1.60){
                contM++;
            } else {
                contG++;
            }
        }
        //System.out.println("El promedio de estutura por debajo del 1.60mts es: " + (personas/contM)); ESTA MAL EL RESULTADO VER EXTRA6B
        //System.out.println("El promedio de estatura en general es: " + (personas/contG)); ESTA MAL EL RESULTADO VER EXTRA6B
    }
}

    

