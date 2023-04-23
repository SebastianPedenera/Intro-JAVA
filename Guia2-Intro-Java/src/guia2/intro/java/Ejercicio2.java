package guia2.intro.java;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = leer.nextLine();
        System.out.println("Hola " + nombre);
    }

}
