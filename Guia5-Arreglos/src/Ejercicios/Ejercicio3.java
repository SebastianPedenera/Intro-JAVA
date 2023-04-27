/*
 Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int N =sc.nextInt();
        int [] vector = new int [N];
        int con1=0,con2=0,con3=0,con4=0,con5=0;
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*10000);
            System.out.println(" "+ vector[i]);
            if (vector[i]<=9) {
                con1++;
            }else if (vector[i]>9 && vector[i]<=99) {
                con2++;
            }else if (vector[i]>99 && vector[i]<=999) {
                con3++;
            }else if (vector[i]>999 && vector[i]<=9999) {
                con4++;
            }else if (vector[i]>9999) {
                con5++;
            }
        }
         System.out.println("El vector tiene " +con1+ " números de un dígito");
            System.out.println("El vector tiene " +con2+ " números de dos dígitos");
            System.out.println("El vector tiene " +con3+ " números de tres dígitos");
            System.out.println("El vector tiene " +con4+ " números de cuatro dígitos");
            System.out.println("El vector tiene " +con5+ " números de cinco dígitos");
    }
}
