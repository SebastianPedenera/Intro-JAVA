/*
  Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor limite");
        int numMax = sc.nextInt();
        int suma = 0;

        do {
            System.out.println("Ingrese numeros para sumar");
            int num = sc.nextInt();
            suma = suma + num;
        } while (suma < numMax);
        System.out.println("Llegaste al limite!" + "(" + numMax + ")");
    }
} 
