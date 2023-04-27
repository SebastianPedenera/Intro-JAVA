package Extra;

import java.util.Scanner;

public class Extra3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamVec = sc.nextInt();
        int vector[] = new int[tamVec];
        llenar(vector);
        mostrar(vector);
    }

    public static void llenar(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void mostrar(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println();
    }
}
