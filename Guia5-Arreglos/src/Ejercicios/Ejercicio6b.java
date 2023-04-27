/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio6b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 3;
        int matriz[][] = new int[N][N];
        System.out.println("Ingrese 9 números entre 1 y 9");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Ingrese el número: " + (i+1));
                do {
                    matriz[i][j] = sc.nextInt();
                    if (matriz[i][j] > 9 || matriz[i][j] < 1) {
                        System.out.println("El número ingresado es mayor a 9");
                    }
                } while (matriz[i][j] > 9 || matriz[i][j] < 1);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        int sumaD1 = 0, sumaD2 = 0, sumaC, sumaF;
        int col[] = new int[N];
        int fila[] = new int[N];
        for (int i = 0; i < N; i++) {
            sumaD1 += matriz[i][i];
            sumaC = 0;
            sumaF = 0;
            for (int j = 0; j < N; j++) {
                sumaC += matriz[j][i];
                sumaF += matriz[i][j];
                if ((i + j) == N - 1) {
                    sumaD2 += matriz[i][j];
                }
                col[i] = sumaC;
                fila[i] = sumaF;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println("La suma de la columna " + (i + 1) + " es: " + col[i]);
        }
        for (int i = 0; i < N; i++) {
            System.out.println("La suma de la fila " + (i + 1) + " es: " + fila[i]);
        }
        System.out.println("La diagonal princial es: " + sumaD1);
        System.out.println("La diagonal traspuesta es: " + sumaD2);
        System.out.println("====================================");
        int cont = 0;
        for (int i = 0; i < N; i++) {
            if (col[i] == fila[i] && col[i] == sumaD1 && fila[i] == sumaD1 && col[i] == sumaD2 && fila[i] == sumaD2) {
                cont++;
            }
        }
        if (cont == 3) {
            System.out.println("ES UNA MATRIZ MÁGICA");
        } else {
            System.out.println("No es una Matriz Mágica");
        }
    }
}
