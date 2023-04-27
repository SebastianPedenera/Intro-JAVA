/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio5b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número limite positivo");
        int num = sc.nextInt();
        int suma = 0;
        System.out.println("Ingrese los números a sumar: ");
        do {
            suma = suma + sc.nextInt();
        } while (num >= suma);
        System.out.println("la suma de los números es: " + suma + " Y supero al número inicial " + num);
    }
}
