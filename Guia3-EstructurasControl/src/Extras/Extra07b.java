/*
 Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package Extras;

import java.util.Scanner;

public class Extra07b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a analizar");
        int n=sc.nextInt(), cont=0;
        double max=0, min=0, suma=0;
        while (cont !=n) {
            System.out.println("Ingrese el número: " +(cont+1));
            int num = sc.nextInt();
            suma=suma+num;
            if (max<num) {
                max=num;
            }
            if (min==0) {
                min=num;
            }
            if (min>num) {
                min=num;
            }
            cont++;
        }
        System.out.println("El valor minimo es; "+min+" el valor maximo es: "+max+" el promedio es: " + (suma/n));
    }
}
