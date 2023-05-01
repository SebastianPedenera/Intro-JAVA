package Servicio.Teorico;

import Entidades.Teorico.Persona;
import java.util.Scanner;

public class PersonaService {
    
    Scanner sc = new Scanner(System.in);
    Persona personaCompleta = new Persona();
    
    public Persona crearPersona() {
        System.out.println("Ingrese el nombre");
        personaCompleta.setNombre(sc.next());
        System.out.println("Ingrese el apellido");
        personaCompleta.setApellido(sc.next());
        return personaCompleta;
    }
    
    public void mostrarPersona(Persona personaCompleta){
        System.out.println("El nombres es: "+ personaCompleta.getNombre());
        System.out.println("El apellido es: "+ personaCompleta.getApellido());
    }

}
