
package guia.pkg4.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros:");
        double euro = leer.nextDouble();
        System.out.println("A qué desea convertir\n"
                + "1 - Dolar\n"
                + "2 - Libras\n"
                + "3 - Yenes");
        int opc = leer.nextInt();
        String moneda = "";
        switch (opc) {
            case 1:
                moneda = "dolar";
                break;
            case 2:
                moneda = "libra";
                break;
            case 3:
                moneda = "yenes";
                break;
        }
        cambio(euro, moneda);
    }
    public static void cambio(double euros, String tipoMoneda) {
        if (tipoMoneda.equalsIgnoreCase("dolar")) {
            System.out.println("Son " + euros*1.28611 + " dolares");
        } else if (tipoMoneda.equalsIgnoreCase("libra")) {
            System.out.println("Son " + euros*0.86 + " libras");
        } else if (tipoMoneda.equalsIgnoreCase("yenes")) {
            System.out.println("Son " + euros*129.852 + " yenes");
        }
    }
}
