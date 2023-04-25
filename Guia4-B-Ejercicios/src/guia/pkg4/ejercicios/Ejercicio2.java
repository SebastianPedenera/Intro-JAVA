package guia.pkg4.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        String resp = "S";
        int N = leer.nextInt();
        nombredad(N);
    }
    public static void nombredad(int N) {
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        String respuesta;
        int edad;
        for (int i = 0; i < N; i++) {
            System.out.println("Ingresa el nombre");
            nombre = leer.next();
            System.out.println("Ingresa la edad");
            edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println("El nombre es " + nombre + " tiene " + edad + " años, es mayor de edad");
            } else {
                System.out.println("El nombre es " + nombre + " tiene " + edad + " años, y NO es mayor de edad");
            }
            if (i < N - 1) {
                System.out.println("Desea continuar (s/n)");
                respuesta = leer.next();
                if (respuesta.equalsIgnoreCase("N")) {
                    i = N;
                }
            }
        }
    }
}
