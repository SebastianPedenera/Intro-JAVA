package Teorico;

import java.util.Scanner;

public class Guia4Teorico {

    public static void main(String[] args) {

        String nombre = "Mariano";
        int edad = 29;
        mostrarInfo(nombre, edad);
    }

    public static void mostrarInfo(String n, int e) {
        System.out.println("El nombre del usuario es: " + n + " y su edad:" + e);
    }
}
