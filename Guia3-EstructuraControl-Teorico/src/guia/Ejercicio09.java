/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número
*/

package guia;

import java.util.Scanner;

public class Ejercicio09 {
public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
            int num;
            int cont = 20;
            int suma = 0;
            
            do {
                System.out.println("Ingrese numero. " + cont + " numeros restantes");
                num = read.nextInt();
                cont --;
                suma = suma + num;
            } while (num != 0 && cont != 0);
            if (num == 0){
                System.out.println("Se capturo el numero 0");
            } else if (cont == 0) {
                System.out.println("Ingresaste 20 numeros.");
            }
            System.out.println("La suma de los numeros ingresados es " + suma);
    }
}

