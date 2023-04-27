package Ejercicios;

import java.util.Scanner;

public class Ejercicio2b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int cantPer = sc.nextInt();
        nombreEdad(cantPer);
    }

    public static void nombreEdad(int cantPer) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String opc;
            for (int i = 1; i < cantPer + 1; i++) {
            System.out.println("Ingrese el nombre de la persona numero: " + i);
            nombre = sc.next();
            System.out.println("Ingrese la edad de la persona numero: " + i);
            int edad = sc.nextInt();
            if (edad < 18) {
                System.out.println(nombre + " tiene " + edad + " y es mayor de edad");
            } else {
                System.out.println(nombre + " tiene " + edad + " y es menor de edad");
            }
            System.out.println("Desea seguir mostrando personas ? (Si/No)");
            opc = sc.next();
                if (opc.equalsIgnoreCase("no")) {
                    break;
                }
            } 
    }
    }
    

