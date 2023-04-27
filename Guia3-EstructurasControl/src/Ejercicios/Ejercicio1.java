/*
Crear un programa que dado un número determine si es par o impar.
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Su numero par.");
        } else {
            System.out.println("Su numero es impar");
        }
    }
}
