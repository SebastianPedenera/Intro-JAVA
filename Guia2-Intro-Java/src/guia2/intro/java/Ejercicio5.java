package guia2.intro.java;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero un entero:");
        int numero = leer.nextInt();
        int doble = numero * 2;
        int triple = numero * 3;
        double raiz = Math.sqrt(numero);
        System.out.println("El doble del número es: " + doble);
        System.out.println("El triple del número es: " + triple);
        System.out.println("La raiz del número es: " + raiz);

    }

}
