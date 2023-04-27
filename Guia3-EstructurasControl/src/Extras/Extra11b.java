/*
Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 */
package Extras;

import java.util.Scanner;

public class Extra11b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int cont=0, num = sc.nextInt();
        do {            
            num = num/10;
            cont++;
        } while (num !=0);
        System.out.println("El número ingresado tiene : " +cont+ " dígitos");
    }
}
