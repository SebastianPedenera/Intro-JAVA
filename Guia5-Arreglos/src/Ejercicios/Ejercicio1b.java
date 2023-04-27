/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package Ejercicios;

public class Ejercicio1b {

    public static void main(String[] args) {
        int arreglo [] = new int [101]; 
        
        for (int i = 100; i >= 1; i--) {
            arreglo[i]= i;
            System.out.println("["+arreglo[i]+"]");
        }
        
    }
}
