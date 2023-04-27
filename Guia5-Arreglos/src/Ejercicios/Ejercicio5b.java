/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package Ejercicios;


public class Ejercicio5b {

    public static void main(String[] args) {
        System.out.println(" COMPROBACION DE LA MATRIZ ANTISIMÉTRICA ");
        int N = 3;
        int matriz[][] = {{0,-2,4},{2,0,2}, {-4,-2,0}};
        int matriztras[][] = new int [N][N];
        System.out.println(" MATRIZ ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
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
        boolean anti=true;
        for (int i = 0; i < N; i++) {
            if (matriz[i][i]!=0) {
                anti=false;
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] != -(matriztras[i][j])) {
                anti =false;
                }
            }
        }
        if (anti) {
            System.out.println("Las matrices son antisimetricas");
        }else 
            System.out.println("Las dos matrices no son antisimetricas");

        
        
        System.out.println(" CON NÚMEROS ALEATORIOS ");
        int matriz2[][] = new int [N][N];
        int matriztras2[][] = new int [N][N];
        System.out.println(" MATRIZ ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz2[i][j]=(int)(Math.random()*10);
                System.out.print("["+matriz2[i][j]+"]");
            }
            System.out.println(" ");
        }
           System.out.println(" MATRIZ TRASPUESTA ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriztras2[i][j] = matriz2[j][i];
                System.out.print("["+matriztras2[i][j]+"]");
            }
            System.out.println(" ");
        }
        boolean anti2=true;
        for (int i = 0; i < N; i++) {
            if (matriz2[i][i]!=0) {
                anti2=false;
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz2[i][j] != -(matriztras2[i][j])) {
                anti2 =false;
                }
            }
        }
        if (anti2) {
            System.out.println("Las matrices son antisimetricas");
        }else 
            System.out.println("Las dos matrices no son antisimetricas");
    }
}