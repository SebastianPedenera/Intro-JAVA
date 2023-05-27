package Servicio;

import Entidades.PerroExtra;
import Entidades.PersonaExtra;
import Enumeraciones.RazaExtra;
import Servicio.PersonaService;
import java.util.ArrayList;
import java.util.Scanner;

public class AdopcionService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<PerroExtra> listaPerros = new ArrayList<>();

    public PerroExtra crearPerro() {
        PerroExtra perro = new PerroExtra();
        System.out.print("Ingrese el nombre del perro: ");
        perro.setNombre(leer.next());
        System.out.println("Seleccione una raza de perros: ");
        for (RazaExtra aux : RazaExtra.values()) {
            System.out.println(aux);
        }
        String razaElegida = leer.next();
        for (RazaExtra raza : RazaExtra.values()) {
            if (raza.toString().equalsIgnoreCase(razaElegida)) {
                perro.setRaza(raza);
                break;
            }
        }
        if (perro.getRaza() == null) {
            perro.setRaza(RazaExtra.OTROS);
        }
        System.out.print("Ingrese la edad: ");
        perro.setEdad(leer.nextInt());
        System.out.print("Ingrese el tamaño: ");
        perro.setTamanio(leer.next());
        return perro;
    }

    public void fabricaPerros() {
        System.out.print("Ingrese la cantidad de perros: ");
        int cant = leer.nextInt();
        for (int i = 0; i < cant; i++) {
            listaPerros.add(crearPerro());
        }
    }

    public void perrosDisponibles() {
        for (PerroExtra perro : listaPerros) {
            if (perro.isAdoptado()) {
                continue;
            }
            System.out.println(perro);
        }
    }

    public void adopcion() {
        
        PersonaService ps = new PersonaService();
        ps.fabricaPersonas();
        fabricaPerros();

        for (PersonaExtra aux : ps.listaPersonas) {
            System.out.println("--------------------------------");
            System.out.println(aux);
            System.out.println("Los perros disponibles son los siguientes:");
            perrosDisponibles();
            System.out.println("Elija el perro que desea adoptar por su nombre y tamaño");
            String nom = leer.next();
            String tam = leer.next();
            for (PerroExtra perro : listaPerros) {
                if (perro.getNombre().equalsIgnoreCase(nom) && perro.getTamanio().equalsIgnoreCase(tam)) {
                    perro.setAdoptado(true);
                    aux.setPerro(perro);
                }
            }
        }
        System.out.println("------------------");
        mostrar(ps.listaPersonas);
    }

    public void mostrar(ArrayList<PersonaExtra> personas) {
        for (PersonaExtra aux : personas) {
            System.out.println(aux);
        }
    }
}
