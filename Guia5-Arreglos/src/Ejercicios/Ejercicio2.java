/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero del vector:");
        int [] vector = new int[sc.nextInt()];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 10);
            
        }
        System.out.println("Adivine el número del 0 al 9");
        int adivinar = sc.nextInt(), cont=0;
        for (int i = 0; i < vector.length; i++) {
            
            if (adivinar == vector[i]) {
                cont++;
                System.out.println("Adivinaste!!! El número se encuentra en la ubicación: "+(i+1));
            }
        }
        System.out.println("Adivinaste: " +cont+" veces");
    }
    
}
