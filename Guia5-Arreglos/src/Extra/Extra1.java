/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package Extra;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamañao del vector");
        int [] vector = new int[sc.nextInt()];
        int suma=0;
        System.out.println("Ingrese " + vector.length + " números");
        for (int i = 0; i < vector.length; i++) {
            vector[i]=sc.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los número del vector es: " +suma);
    }
}
