package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opt;
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion");
            opt = leer.nextInt();
            menuopt(opt, num1, num2);
            if (opt == 5) {
                break;
            }
        } while (opt > 0 || opt < 6);
    }

    public static void menuopt(int opt, int num1, int num2) {
        switch (opt) {
            case 1:
                System.out.println(suma(num1, num2));
                break;
            case 2:
                System.out.println(resta(num1, num2));
                break;
            case 3:
                System.out.println(mult(num1, num2));
                break;
            case 4:
                System.out.println(div(num1, num2));
                break;
        }
    }

    public static int suma(int a, int b) {
        return (a + b);
    }

    public static int resta(int a, int b) {
        return (a - b);
    }

    public static int mult(int a, int b) {
        return (a * b);
    }

    public static int div(int a, int b) {
        return (a / b);
    }
}
