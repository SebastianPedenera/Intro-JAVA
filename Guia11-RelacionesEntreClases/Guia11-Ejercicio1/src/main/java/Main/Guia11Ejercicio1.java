package Main;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

public class Guia11Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Perro per1 = new Perro("chiquito", "caniche", 3, "xxxs");
        Perro per2 = new Perro("fer", "dogo", 5, "xl");
        Persona persona1 = new Persona("fede", "telch", 36, 12345678);
        Persona persona2 = new Persona("martin", "martin", 63, 87654321);
        
        persona1.setPerro(per1);
        
        System.out.println(persona1);
        
    }
}
