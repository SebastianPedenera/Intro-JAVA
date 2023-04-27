/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio2b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el tamaño del arreglo");
        int N = sc.nextInt();
        int arreglo[] = new int [N];
        for (int i = 0; i < N; i++) {
            arreglo[i]=(int)(Math.random()*10);
        }
        System.out.println("Adivine un número dentro del arreglo");
        int num= sc.nextInt();
        int cont=0, rep=-1;
        for (int i = 0; i < N; i++) {
            if (num==arreglo[i]) {
                cont=i;
                rep++;
                System.out.println("El número se encuentra en la posición "+(cont+1)+" y "+ rep+ " repetido");
            }
        }
        if (rep ==-1) {
            System.out.println("El número no se encuentra en el arreglo");
        }
    }
}
