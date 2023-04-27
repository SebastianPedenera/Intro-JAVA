/*
 Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio3b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra de 8 letras");
        String palabra = sc.next();
        if (palabra.length() == 8 ) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        } 
    }
}
