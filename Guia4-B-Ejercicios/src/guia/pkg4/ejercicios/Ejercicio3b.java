/*
 Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
package guia.pkg4.ejercicios;

import java.util.Scanner;

public class Ejercicio3b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros:");
        double euro =sc.nextDouble();
        menu(euro);
    }
    public static void menu(double euro){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija la moneda a cotizar: ");
        System.out.println("1. Libra");
        System.out.println("2. Dolar");
        System.out.println("3. Yenes");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println(euro + " Euros equivalen a: " + (euro*0.86)+ " Libras");
                break;
            case 2:
                System.out.println(euro + " Euros equivalen a: " + (euro*1.29)+ " Dolares");
                break;
            case 3:
                System.out.println(euro + " Euros equivalen a: " + (euro*129.86)+ " Yenes");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }
}
