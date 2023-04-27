/*
 Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package Extras;

import java.util.Scanner;

public class Extra07c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a analizar");
        int n = sc.nextInt();
        
        System.out.println("Ingrese el primer número");
        int num = sc.nextInt();
        double max = 0, min = num, suma = num, cont = 1;
        do {
            System.out.println("Ingrese el número: " + (cont + 1));
            num = sc.nextInt();
            suma = suma + num;
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            cont++;
        } while (cont != n);
        System.out.println("El valor minimo es; "+min+" el valor maximo es: "+max+" el promedio es: " + (suma/n));
    }
}
