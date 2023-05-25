package Main;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

public class Guia11Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Perro perro1 = new Perro("Tito", "Caniche", 3, "XS");
        Perro perro2 = new Perro("Negro", "Dogo", 5, "XL");
        Persona persona1 = new Persona("Federico", "Sosa", 36, 12345678);
        Persona persona2 = new Persona("Martin", "Paes", 51, 87654321);
        
        System.out.println("  # Lista de las personas inscriptas para adoptar un perro: ");
        System.out.println(persona1);
        System.out.println(persona2);
        
        System.out.println("----------------------");
        System.out.println("  # Lista de perros en adopcion: ");
        System.out.println(perro1);
        System.out.println(perro2);
        
        System.out.println("----------------------");
        persona1.setPerro(perro2);
        persona2.setPerro(perro1);
        
        System.out.println("  # Lista de los perros adoptados con sus dueños: ");
        System.out.println(persona1);
        System.out.println(persona2);
        
    }
}
