/*
 Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      //Llenado del Vector
       int [] vector = new int [101];
       for (int i=100; i > 0; i--){
       vector[i] = i;
           System.out.println("["+vector[i]+ "]");
       }
    }
}
