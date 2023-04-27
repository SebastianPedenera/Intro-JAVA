/*
 Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package Extras;

import java.util.Scanner;

public class Extra10b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mult1 = (int) (Math.random()*5);
        int mult2 = (int) (Math.random()*5);
        int adivina = mult1*mult2, res=0;
        do {            
            System.out.println("Intente adivinar el resultado oculto");
            res = sc.nextInt();
        } while (res !=adivina);
        System.out.println("Adivinaste!!!");
    }
}
