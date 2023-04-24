/*
Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
2
Bucles y sentencias de salto break y continue
 */
package guia.pkg3.ejercicios;

import java.util.Scanner;

public class Ejercicio4b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String frase = sc.nextLine();
        
        if (frase.substring(0,1).equals("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("incorrecto");
        }
    }
    
}
