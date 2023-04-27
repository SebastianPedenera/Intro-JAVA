/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package Extras;

import java.util.Scanner;

public class Extra01b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los minutos a calcular");
        int min = sc.nextInt();
        int hs = min/60;
        int dias = hs/24;
        hs = hs - (dias * 24);
        System.out.println(dias + " dia(s) " + hs + " Horas " + min + " minutos ");
    }
}
