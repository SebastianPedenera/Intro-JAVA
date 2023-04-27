/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package Extra;

import java.util.Scanner;

public class Extra1b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a sumar:");
        int N = sc.nextInt();
        int suma = 0;
        int vector[] = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el número: " + (i + 1));
            vector[i] = sc.nextInt();
            suma += vector[i];
        }
        for (int i = 0; i < N; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("La suma del vector es: " + suma);
    }
}
