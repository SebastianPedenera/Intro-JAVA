package guia2.intro.java;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura Celcius: ");
        float temperaturaCelcius = leer.nextFloat();
        float temperaturaF = 32 + (9 * temperaturaCelcius / 5);
        System.out.println("La temperatura en Fahrenheit es: " + temperaturaF);
    }

}
