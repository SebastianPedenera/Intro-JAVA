/*
 Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package guia.pkg4.teorico;


import java.util.Scanner;

public class Teoria11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase" );
        String frase = sc.nextLine();
        codificar(frase); 
               
    }
    public static void codificar(String frase) {
        String frase2 = "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i, i+1).toLowerCase()) {
                case "a":
                    frase2 += "@"; 
                    break;
                 case "e":
                    frase2 += "#";
                    break;
                 case "i":
                    frase2 += "$";
                    break;
                 case "o":
                    frase2 += "%";
                    break;
                 case "u":
                    frase2 += "*";
                    break;
                default:
                    frase2 += frase.substring(i, i+1);
            }
            }
        System.out.println(" " + frase2);
        }
    }    

