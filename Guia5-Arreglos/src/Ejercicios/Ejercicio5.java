package Ejercicios;

public class Ejercicio5 {

    public static void main(String[] args) {
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matriztraspuesta = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriztraspuesta[i][j] = matriz[j][i];
                System.out.print(" " + matriztraspuesta[i][j]);
            }
            System.out.println("");
        }

        boolean antisimetrico = true;
        for (int i = 0; i < 3; i++) {
            if (matriz[i][i] != 0) {
                antisimetrico = false;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != (-matriztraspuesta[i][j])) {
                    antisimetrico = false;
                }
            }

        }
        if (antisimetrico) {
            System.out.println("LA MATRIZ ES ANTISIMETRICA");
        } else {
            System.out.println("LA MATRIZ NO ES ANTISIMETRICA");
        }
    }
}
