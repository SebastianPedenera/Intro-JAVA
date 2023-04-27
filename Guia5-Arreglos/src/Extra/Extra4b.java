/*
 Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
package Extra;

import java.util.Scanner;

public class Extra4b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2,aprov = 0, desap = 0;
        double nota1, nota2, nota3, nota4;
        double[] prom = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1));
            System.out.println("Nota del primer trabajo practico: ");
            nota1 = sc.nextInt();
            System.out.println("Nota del segundo trabajo practico: ");
            nota2 = sc.nextInt();
            System.out.println("Nota del primer Integrador: ");
            nota3 = sc.nextInt();
            System.out.println("Nota del segundo Integrador: ");
            nota4 = sc.nextInt();
            prom[i] = (nota1 * 0.1)+(nota2 * 0.15)+(nota3 * 0.25)+(nota4 * 0.5);
            if (prom[i] >= 7) {
                aprov++;
            } else {
                desap++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("[" + prom[i] + "]");
        }System.out.println("");
        System.out.println("La cantidad de aprovados son: " + aprov);
        System.out.println("La cantidad de desaprovados son: " + desap);
    }
}
