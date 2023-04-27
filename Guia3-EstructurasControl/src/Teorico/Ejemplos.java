package Teorico;

import java.util.Scanner;

public class Ejemplos {

    public static void main(String[] args) {
// Ejemplo con If y Else
        {
            int num1 = 5;
            int num2 = 7;
            if (num1 < num2) {
                System.out.println("La variable num1 aloja un número menor a la variable num2");
            } else {
                System.out.println("La variable num1 aloja un número mayor a la variable num2");
            }
        }
//Ejemplo con swich and default
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese una opción");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Esta línea de código se ejecuta si opcion = 1");
                break;
            case 2:
                System.out.println("Esta línea de código se ejecuta si opcion = 2");
                break;
            default:
                System.out.println("El valor ingresado en la variable opcion es diferente" + "a todos los casos analizados por el switch");
        }
// Ejemplo de swich
        {
            String respuesta = "S";
            while (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Desea continuar?");
                respuesta = leer.next();
            }
        }

        String respuesta;
        do {
            System.out.println("Desea continuar?");
            respuesta = leer.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
// Ejemplo de la funcion para 
        for (int i = 0; i < 10; i++) {
            System.out.println("Imprimo el valor de i: " + i);
        }
        System.out.println("===================================");
        System.out.println("For decreciendo");
        {
            for (int i = 10; i > 0; i--) {
                System.out.println("Imprimo el valor de i: " + i);
            }
        }
    }

}
// las ultimas dos llaves se utilizan para cerrar la clase y la clase madre

