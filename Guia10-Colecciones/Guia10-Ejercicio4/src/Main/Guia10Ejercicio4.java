
package Main;

import Entidad.Pelicula;
import Service.ServicePelicula;
import java.util.ArrayList;

public class Guia10Ejercicio4 {

    public static void main(String[] args) {
     
       ArrayList<Pelicula> pelis = new ArrayList();
       ServicePelicula sp = new ServicePelicula();
       sp.fabricaPeliculas(pelis);
       System.out.println("--------------------------");
       System.out.println("Muestra original");
       sp.mostrarLista(pelis);
       System.out.println("--------------------------");
       System.out.println("Muestra Largometrajes");
       sp.mostrarLargos(pelis);
       sp.ordenarPorDuracionAsc(pelis);
       System.out.println("--------------------------");
       System.out.println("Muestra ascendente");
       sp.mostrarLista(pelis);
       sp.ordenarPorDuracionDesc(pelis);
       System.out.println("--------------------------");
       System.out.println("Muestra descendente");
       sp.mostrarLista(pelis);
       sp.ordenarTituloAsc(pelis);
       System.out.println("--------------------------");
       System.out.println("Muestra orden x titulos");
       sp.mostrarLista(pelis);
       sp.ordenarDirectorAsc(pelis);
       System.out.println("--------------------------");
       System.out.println("Muestra orden por director");
       sp.mostrarLista(pelis);
    }
    
}
