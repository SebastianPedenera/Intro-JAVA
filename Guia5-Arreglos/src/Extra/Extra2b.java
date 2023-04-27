/*
 Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package Extra;

import java.util.Scanner;

public class Extra2b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores:");
        int N = sc.nextInt();
        int vector1[] = new int [N];
        int vector2[] = new int [N];
        for (int i = 0; i < N; i++) {
            vector1[i] = (int) (Math.random() * 9);
            System.out.print("[" + vector1[i] + "]");
        }
        System.out.println("");
        
        for (int i = 0; i < N; i++) {
            vector2[i] = (int) (Math.random() * 9);
            System.out.print("[" + vector2[i] + "]");
        }
        System.out.println("");
        boolean iguales=true;
        for (int i = 0; i < N; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Los vectores son diferentes en el "+(i+1)+ " número.");
                iguales=false;
                break;
            }
        }
            if (iguales) {
                System.out.println("Los vectores son iguales");
            }
    }
}
