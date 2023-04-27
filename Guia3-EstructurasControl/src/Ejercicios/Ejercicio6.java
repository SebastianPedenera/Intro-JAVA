
package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        String exit = "";
        System.out.println("Ingrese 2 numeros enteros positivos");
        double num1 = sc.nextInt(), num2 = sc.nextInt();

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("El resultado de la suma es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("El resultado de la division es " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa?(S/N)");
                    exit = sc.next();
                    if (exit.equalsIgnoreCase("S")) {
                        System.out.println("Saliste del programa");
                    }
                    break;
            }
        } while (opc != 5 || exit.equalsIgnoreCase("N"));
    }
}
