
package Extras;

import java.util.Scanner;

public class Extra05 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tipo de socio (A/B/C)");
        char opc = sc.next().charAt(0);
        System.out.println("Ingrese el monto del tratamiento");
        double monto = sc.nextDouble();

        switch (opc) {
            case 'a':
                System.out.println("El monto a pagar para socios tipo A es: " + (monto * 0.50));
                break;
            case 'b':
                System.out.println("El monto a pagar para socios tipo B es: " + (monto * 0.65));
                break;
            case 'c':
                System.out.println("El monto a pagar para socios tipo C es: " + monto);
                break;
        }

    }
}

