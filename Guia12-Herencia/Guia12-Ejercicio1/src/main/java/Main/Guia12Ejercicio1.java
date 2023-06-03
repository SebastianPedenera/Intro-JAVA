package Main;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

public class Guia12Ejercicio1 {

    public static void main(String[] args) {
        Animal perro = new Perro("Stich","Croquetas",15,"Doberman");
        perro.alimentar();
       
        Animal gato = new Gato("Pelusa","Galletas",10,"Siames");
        gato.alimentar();

        Animal caballo = new Caballo("Spark","Pasto",15,"Fino");
        caballo.alimentar();
        
        ArrayList <Animal> animales = new ArrayList();
        animales.add(gato);
        animales.add(perro);
        animales.add(caballo);
        for (Animal aux : animales) {
            if (aux instanceof Perro) {
                System.out.println(aux.getNombre() + " es un perro ");
            }
            if (aux instanceof Gato) {
                System.out.println(aux.getNombre() + " es un gato ");
            }
            if (aux instanceof Caballo) {
                System.out.println(aux.getNombre() + " es un caballo ");
            }
        }
    }
}
