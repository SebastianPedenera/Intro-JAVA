/*
 Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1
12
123
 */
package guia.pkg3.extra;

import java.util.Scanner;

public class Extra13b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num =sc.nextInt(), cont=0; 
        String suma = "";
        for (int i = 0; i < num; i++) {
            cont++;
            for (int j = 0; j < cont; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }
}
