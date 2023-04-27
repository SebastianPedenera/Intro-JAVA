/*
 14.Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package Extras;

import java.util.Scanner;

public class Extra14b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Familias");
        int N = sc.nextInt(), suma=0, cont=0;
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia:" +(i+1));    
            int M = sc.nextInt();
            for (int j = 0; j < M; j++) {
                System.out.println("Ingres la edades:");
                int edad =sc.nextInt();
                suma += edad;
                cont++;
            }
        }
        System.out.println("El promedio de edades de todas las familias es:" +(suma/cont));
    }    
}
