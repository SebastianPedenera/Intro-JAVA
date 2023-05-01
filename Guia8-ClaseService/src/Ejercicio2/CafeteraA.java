
package Ejercicio2;


import Servicio.Ejercicio2.CafeteraService;
import java.util.Scanner;

public class CafeteraA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CafeteraService cafe1 = new CafeteraService();
        cafe1.llenaCafetera();
        cafe1.servirTaza();
        cafe1.agregarCafe();
        cafe1.mostrar();
        
    }
}
