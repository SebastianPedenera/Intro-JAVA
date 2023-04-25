/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
*/
package guia.pkg3.extra;

import java.util.Scanner;

public class Extra08b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0, contPar=0, contImp=0;
        while (cont!=-1) {
            System.out.println("Ingrese un número");
            int num = sc.nextInt();
            if (num%2==0) {
                contPar++;
            } else 
                contImp++;
            cont++;
            if (num%5==0) 
                break;
        }
        System.out.println("La cantidad de números leidos es: " +cont+" la cantidad par: "+contPar+" la cantidad impar: "+contImp);
    }
    
}
