/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
*/

package Teórico;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de participantes del grupo");
        String[][] equipo = new String[leer.nextInt()][leer.nextInt()];

        for (int i = 0; i < equipo[0].length; i++) {
            System.out.println("Ingrese los participantes de la fila "+(i+1));
            for (int j = 0; j < equipo[0].length; j++) {
               System.out.println("Ingrese el nombre "+(j+1));
                equipo[i][j]=leer.next();
            }
        }
        String aux = "";
        for (String [] fila: equipo) {
        aux = "";
            for (String elemento: fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
        }
    } 