/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
package Ejercicios;


public class Ejercicio4b {

    public static void main(String[] args) {
        int N = 4;
        int matriz[][] = new int [N][N];
        int matriztras[][] = new int [N][N];
        System.out.println(" MATRIZ ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
           System.out.println(" MATRIZ TRASPUESTA ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriztras[i][j] = matriz[j][i];
                System.out.print("["+matriztras[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
    
}
