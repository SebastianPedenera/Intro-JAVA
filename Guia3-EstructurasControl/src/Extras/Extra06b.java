/*
 Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package Extras;

import java.util.Scanner;

public class Extra06b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        double n = sc.nextDouble(), altura, sumaB = 0, sumaA = 0, contB = 0, contA = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la estatura de la pesona: " + (i+1));
            altura = sc.nextDouble();
            if (altura<1.6) {
                sumaB = sumaB + altura;
                contB++;
            } else {
                sumaA = sumaA + altura;
                contA++;
            }
        }
        System.out.println("El promedio por debajo de 1,60 es de: " + (sumaB/contB) +" metros");
        System.out.println("El promedio mayor de 1,60 es de: " + (sumaA/contA) +" metros");
    }
    
}
