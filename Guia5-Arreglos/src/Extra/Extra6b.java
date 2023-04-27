/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
package Extra;

import java.util.Scanner;

public class Extra6b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sopa[][] = new char[20][20];
        String palabra;

        System.out.println("Ingrese 5 palabras");
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                
            }
        }
        
        /*
        for (int k = 0; k < 5; k++) {
            System.out.println("Palabra " + (k + 1));
            do {
                palabra = sc.next();
            } while (palabra.length() < 3 || palabra.length() > 5);
            for (int l = 0; l < palabra.length(); l++) {
                char letras[] = new char[palabra.length()];
            }
        }
*/

    }

}


