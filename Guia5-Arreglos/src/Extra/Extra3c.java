/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package Extra;

import java.util.Scanner;

public class Extra3c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int a = sc.nextInt();
        int vector[]= new int [a];
        rellenar(vector);
        imprimir(vector);
    
    }
    public static void rellenar(int vector[]) {
    
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*9); 
        }
    }
    public static void imprimir(int vector[]) {
   
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }System.out.println(" ");
        
    }
}
