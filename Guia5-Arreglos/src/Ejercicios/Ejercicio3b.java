/*
 Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio3b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = sc.nextInt(), div, cont, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        int vector[]= new int[N];
        for (int i = 0; i < N; i++) {
            vector[i]= (int)(Math.random()*99999);
            System.out.println("["+vector[i]+"]");
        }
       
        for (int i = 0; i < N; i++) {
            cont=0;
            div=vector[i];  
            do {
                div = div/10;
                cont++;
            } while (div!=0);
            switch (cont) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
        }    
        }
        System.out.println("Los numeros de un dígito son:"+cont1);
        System.out.println("Los numeros de dos dígitos son:"+cont2);
        System.out.println("Los numeros de tres dígitos son:"+cont3);
        System.out.println("Los numeros de cuatro dígitos son:"+cont4);
        System.out.println("Los numeros de cinco dígitos son:"+cont5);
    }
}
