package Extra;

import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        int contAprob = 0;
        int contRepro = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota del TP1 del " + (i + 1) + "° alumno");
            double notaTP1 = sc.nextDouble();
            System.out.println("Ingrese la nota del TP2 del " + (i + 1) + "° alumno");
            double notaTP2 = sc.nextDouble();
            System.out.println("Ingrese la nota del Integrador1 del " + (i + 1) + "° alumno");
            double notaInt1 = sc.nextDouble();
            System.out.println("Ingrese la nota del Integrador2 del " + (i + 1) + " alumno");
            double notaInt2 = sc.nextDouble();
            notas[i] = notaTP1 * 0.1 + notaTP2 * 0.15 + notaInt1 * 0.25 + notaInt2 * 0.5;
            System.out.println(notas[i]);
            if (notas[i] >= 7) {
                contAprob++;
            } else {
                contRepro++;
            }
        }
        System.out.println("La cantidad de aprobados es " + contAprob + " y la desaprobados " + contRepro);
    }
}
