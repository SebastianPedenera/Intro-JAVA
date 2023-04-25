
package guia.pkg3.extra;

import java.util.Scanner;

public class Extra01 {

    public static void main(String[] args) {
        System.out.println("Ingrese el tiempo en minutos a calcular: ");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int hs = min/60;
        int dias = hs/24;
        hs = hs - (dias * 24);
     System.out.println(min + " minutos, es equivalente a " + dias + " dia(s) y " + hs + " hora(s)");
    }
    }
