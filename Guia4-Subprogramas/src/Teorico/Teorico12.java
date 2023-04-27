/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package Teorico;

import java.util.Scanner;

public class Teorico12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos números:");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        EsMultiplo(num1, num2);
    }
    
    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
           System.out.println("El numero " + num1 + " es multiplo de " + num2);
        } else  {
            System.out.println("El numero " + num1 + " no es multiplo de " + num2);
        }
    }
}
