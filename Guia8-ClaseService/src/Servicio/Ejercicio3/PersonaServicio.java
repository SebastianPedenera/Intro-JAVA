
package Servicio.Ejercicio3;

import Entidades.Ejercicio3.Persona;
import java.util.Scanner;

/// a) Metodo  1º
public class PersonaServicio {

    Persona persona = new Persona();
    Scanner sc = new Scanner(System.in);

    public boolean esMayorDeEdad() {

        return persona.getEdad() > 18;
    }

/// b) Metodo  2º   
    public void crearPersona() {
        System.out.println("Ingrese su nombre:");
        persona.setNombre(sc.next());
        System.out.println("Ingrese su edad:");
        persona.setEdad(sc.nextInt());
        System.out.println("Ingrese su sexo:");
        Boolean validacion = false;
        do {
            System.out.println("(H) Masculino, (M) Mujer, (O) Otro");
            persona.setSexo(sc.next());
            String sexo = persona.getSexo();
            if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")) 
                validacion = true;
            else
                System.out.println("Ingreso un valor invalido");
            
                
        } while (!validacion);
        System.out.println("Ingrese su peso:");
        persona.setPeso(sc.nextDouble());
        System.out.println("Ingrese su altura:");
        persona.setAltura(sc.nextDouble());

    }

    /*
c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
     */
    public double calcularIMC() {
        double pesoIdeal;
        pesoIdeal = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        if (pesoIdeal < 20) {
            pesoIdeal = -1;
        }
        if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            pesoIdeal = 0;
        }
        if (pesoIdeal > 25) {
            pesoIdeal = 1;
        }
        return pesoIdeal;
    }

}
