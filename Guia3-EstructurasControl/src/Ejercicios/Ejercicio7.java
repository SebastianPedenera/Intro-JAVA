
package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese palabras.");
        int correctas = 0, incorrectas = 0;
        String palabra;
        do {
            palabra = sc.nextLine();
            if (palabra.substring(0, 1).equalsIgnoreCase("X") && palabra.substring(4, 5).equalsIgnoreCase("O") && palabra.length() == 5){
                correctas++;
            } else {
                incorrectas++;
            }
        } while (!palabra.equals("&&&&&"));
        System.out.println("La cantidad de lecturas CORRECTAS es: " + correctas);
        System.out.println("La cantidad de lecturas INCORRECTAS es: " + incorrectas);
    }
}