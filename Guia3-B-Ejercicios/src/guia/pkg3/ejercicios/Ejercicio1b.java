/*
 Crear un programa que dado un número determine si es par o impar.
 */
package guia.pkg3.ejercicios;

import java.util.Scanner;

public class Ejercicio1b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
                System.out.println("El número es impar");
        }
    }
    
}
