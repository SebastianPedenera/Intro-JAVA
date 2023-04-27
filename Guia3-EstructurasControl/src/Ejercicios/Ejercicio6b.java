/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
Menu
1. sumar
2. restar
3. multiplicar
4. dividir
5. salir
elija opcion
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio6b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos números: ");
        double num1 = sc.nextInt(), num2 = sc.nextInt();
        String salir = "";
        int opc;
        
        do {            
             System.out.println("Menu");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("======================");
        System.out.println("Elija una opción: ");
        opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma de los numeros es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La suma de la resta es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La suma de la multiplicación  es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La suma de la división es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("Esta seguro que quiere salir? (S/N)");
                    salir = sc.next();
                    if (salir.equalsIgnoreCase("S")) {
                        System.out.println("¡Gracias por utilizar nuestro sistema!");
                        }
                    break;
                default:
                    System.out.println("Esa opción es Incorrecta");
                    continue;
            }
        } while (opc !=5 || salir.equalsIgnoreCase("N"));
    }
}
