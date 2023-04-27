package Extra;

import java.util.Scanner;

public class Extra3b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamVec = sc.nextInt();
        llenar(tamVec);
    }

    public static int[] llenar(int tamVec) {
        int relleno[] = new int[tamVec];
        for (int i = 0; i < tamVec; i++) {
            relleno[i] = (int) (Math.random() * 10);
            System.out.print("[" + relleno[i] + "]");
        }
        System.out.println();
        return relleno;
    }
}
