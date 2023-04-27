/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuantas personas quiere analizar: ");
        int N = sc.nextInt();
        edades(N);
    }
    public static void edades(int N) {
        Scanner sc = new Scanner(System.in);
        String opc, nombre;
        int edad, cont=0;
        do {
            cont++;
            System.out.println("Ingrese el " +cont+ " nombre");
            nombre=sc.next();
            System.out.println("Ingrese la edad");
            edad=sc.nextInt();
            if (edad<18) {
                System.out.println(nombre + " tiene " + edad + " y es menor de edad");
            }else
                System.out.println(nombre + " tiene " + edad + " y es mayor de edad");
            if (cont==N) {
                break;
            }
            System.out.println("Desea continuar SI/NO");
            opc = sc.next();
            opc = opc.toUpperCase();
            if (opc.equals("NO")) {
                break;
            }
        } while (N != cont);
    }
}
