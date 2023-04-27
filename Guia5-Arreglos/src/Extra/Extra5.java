package Extra;

import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int n = sc.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int m = sc.nextInt();
        int[][] matriz = new int[n][m];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                sum = sum + matriz[i][j];
            }
        }
        System.out.println("La suma de los elementos de la matriz es " + sum);
    }
}