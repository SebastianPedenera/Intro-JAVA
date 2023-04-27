/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector a rellenar con la secuencia fibonacci");
        int tamVec = sc.nextInt();
        System.out.println("*");
        int vector[] = fibo(tamVec);

        for (int fib : vector) {
            System.out.print(fib + ",");
        }
        System.out.println();

    }

    public static int[] fibo(int tamVec) {
        int f[] = new int[tamVec];
        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i < tamVec; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }
}