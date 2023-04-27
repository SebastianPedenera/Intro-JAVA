/*
 Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio7c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Dispositivo RS232. Ingrese una palabra");
        String palabra;
        int cor = 0, incor = 0;
        do {
            do {
                palabra = sc.next();
                if (palabra.length() > 5) {
                    System.out.println("La palabra supera las 5 letras");
                }
            } while (palabra.length() > 5);
            if (palabra.substring(0, 1).equalsIgnoreCase("X") && palabra.substring(palabra.length() - 1, palabra.length()).equalsIgnoreCase("O")) {
                cor = cor + 1;
            } else {
                incor = incor + 1;
            }
        } while (!palabra.equalsIgnoreCase("&&&&&"));
        System.out.println("Las palabras correctas fueron: " + cor);
        System.out.println("Las palabras incorrectas fueron: " + incor);
    }
}
