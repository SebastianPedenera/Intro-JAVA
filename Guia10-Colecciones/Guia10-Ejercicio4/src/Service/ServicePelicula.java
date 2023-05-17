package Service;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ServicePelicula {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {
        Pelicula pelicula = new Pelicula();
        System.out.print("Ingrese el título de la película: ");
        pelicula.setTitulo(sc.next());
        System.out.print("Ingrese el director de la película: ");
        pelicula.setDirector(sc.next());
        System.out.print("Ingrese la duración de la película: ");
        pelicula.setDuracion(sc.nextDouble());
        return pelicula;
    }

    // Como tenemos los datos del objeto por parametro no necesitamos que retorne
    public void fabricaPeliculas(ArrayList<Pelicula> lista) {
        String opcion;
        do {
            System.out.println("Ingrese los datos de la pelicula");
            System.out.println("-------------------");
            lista.add(crearPelicula());
            System.out.println("Quiere seguir agregando peliculas (si/no) ");
            opcion = sc.next();
        } while (opcion.equalsIgnoreCase("si"));
    }

    public void mostrarLista(ArrayList<Pelicula> lista) {
        for (Pelicula elemento : lista) {
            System.out.println(elemento);
        }
    }

    public void mostrarLargos(ArrayList<Pelicula> lista) {
        for (Pelicula elemento : lista) {
            if (elemento.getDuracion() > 1) {
                System.out.println(elemento);
            }
        }
    }

    public void ordenarPorDuracionDesc(ArrayList<Pelicula> lista) {
        Collections.sort(lista, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {

                return Double.compare(p2.getDuracion(), p1.getDuracion());
            }
        });
    }

    // Ordenar con el expresion lambda 
    public void ordenarPorDuracionAsc(ArrayList<Pelicula> list) {
        Collections.sort(list, (Pelicula pelicula1, Pelicula pelicula2)
                -> Double.compare(pelicula1.getDuracion(), pelicula2.getDuracion()));
    }

    public void ordenarTituloAsc(ArrayList<Pelicula> list) {
        Collections.sort(list, (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo()));
    }

    public void ordenarDirectorAsc(ArrayList<Pelicula> list) {
        Collections.sort(list, (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector()));
    }

}
