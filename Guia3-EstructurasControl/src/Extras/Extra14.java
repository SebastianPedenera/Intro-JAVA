/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package Extras;

import java.util.Scanner;

public class Extra14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de familias a analizar:");
        int familia = sc.nextInt(), cont=0, suma=0;
        
        for (int i = 0; i < familia; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia: " + (i+1));
            int hijos = sc.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo: " +(j+1));
                int edad = sc.nextInt();
                cont++;
                suma=suma+edad;
            }
        }
        System.out.println("El promedio de edad de todas las familias es: " +(suma/cont));
    }
}
