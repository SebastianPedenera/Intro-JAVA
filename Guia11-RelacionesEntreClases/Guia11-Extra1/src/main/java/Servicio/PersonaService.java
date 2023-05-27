package Servicio;

import Entidades.PersonaExtra;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<PersonaExtra> listaPersonas = new ArrayList<>();

    public PersonaExtra crearPersona() {
        PersonaExtra uno = new PersonaExtra();
        System.out.print("Ingrese el nombre de la persona: ");
        uno.setNombrePersona(leer.next());
        System.out.print("Ingrese el apellido: ");
        uno.setApellido(leer.next());
        System.out.print("Ingrese el DNI: ");
        uno.setDni(leer.nextInt());
        System.out.print("Ingrese la edad: ");
        uno.setEdadPersona(leer.nextInt());
        return uno;
    }

    public void fabricaPersonas() {
        System.out.print("Ingrese la cantidad de personas: ");
        int cant = leer.nextInt();
        for (int i = 0; i < cant; i++) {
            listaPersonas.add(crearPersona());
            System.out.println(listaPersonas);
        }
    }
    
}
