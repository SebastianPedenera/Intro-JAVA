package guia2.intro.java;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero:");
        int num2 = leer.nextInt();
        System.out.println("La suma de los numero es: " + (num1 + num2));
    }

}
