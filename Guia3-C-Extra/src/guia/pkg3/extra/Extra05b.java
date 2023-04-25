/*
 Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package guia.pkg3.extra;

import java.util.Scanner;

public class Extra05b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique que tipo de socio es A, B o C");
        String socio = sc.next();
        socio = socio.toUpperCase();
        System.out.println("Indique cuanto cuesta el tratamiento");
        int tratamiento = sc.nextInt();
               
        switch (socio) {
            case "A":
                System.out.println("El costo del tratamiento es: " + (tratamiento*0.5));
                break;
            case "B":
                System.out.println("El costo del tratamiento es: " + (tratamiento*0.65));
                break;
            case "C":
                System.out.println("El costo del tratamiento es: " + (tratamiento));
                break;
            default:
                System.out.println("Ingreso una opción incorrecta");
        }
    }
}
