/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
package Teorico;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuatro números (entre 1 - 20)");
        for (int i = 0; i < 4; i++) {
             int num;  
             System.out.println("Ingrese el número: " + (i+1));
            do {
             num = leer.nextInt();
                if ((num >20 || num < 1)) {
                    System.out.println("El número ingresado debe estar entre 1 y 20");
                }
            } while (num >20 || num < 1);
            System.out.print(num + " ");    
             for (int j = 0; j < num; j++) {
                 System.out.print("*");
            }
             System.out.println(" ");
        }
    }
}
