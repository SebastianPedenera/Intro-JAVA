/*
Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que 
la nota sea correcta.
 */

package Teorico;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int nota = leer.nextInt();
    while ( nota>=0 || nota<=10){
        System.out.println("Ingrese una nota del 1 al 10");
        nota = leer.nextInt();                
    }
    System.out.println("La nota " + nota + " es valida");
    }
    
}   
