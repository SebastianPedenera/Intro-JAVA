/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */

package guia.pkg3.ejercicios;

import java.util.Scanner;

public class Ejercicio8b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = 4;
        for (int i = 0; i < num; i++) {
            System.out.println("");
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {   
                System.out.print("* ");
            } else  
                System.out.print("  ");
            }
        }
        System.out.println("");
    }
}
