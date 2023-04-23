/*
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
*/

package guia;
import java.util.*;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 >= 25  && num2 >= 25) {
            System.out.println("Los numeros son mayores a 25");
    } else if (num1 >= 25) {
            System.out.println("El primer numero es mayor");
    } else if (num2 >= 25) {
            System.out.println("El segundo numero es mayor");
    }
        else { System.out.println("Ninguno de los numeros no son mayor a 25");
        }
    }
}
