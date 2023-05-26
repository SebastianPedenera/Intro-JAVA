package Main;

import Service.CodigoPostalService;
import java.util.Scanner;

public class Guia10Extra4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        CodigoPostalService ciudadServ = new CodigoPostalService();
        
        System.out.println("1- Se cargaran las ciudades:");
        ciudadServ.cargarCiudades();
        System.out.println("-------------------------------------");
        System.out.println("2- Mostramos las ciudades cargadas:");
        ciudadServ.mostrar();
        System.out.println("-------------------------------------");
        System.out.println("3- Agrege una ciudad si desea:");
        ciudadServ.agregarCiudad();
        System.out.println("-------------------------------------");
        System.out.println("4- Busque una ciudad si desea:");
        ciudadServ.buscarCiudad();
        System.out.println("-------------------------------------");
        System.out.println("5- Elimine una ciudad si desea:");
        ciudadServ.eliminar();
        System.out.println("-------------------------------------");
        System.out.println("6- Mostramos las ciudades actualizadas:");
        ciudadServ.mostrar();
        System.out.println("-------------------------------------");
        System.out.println(" --- Se acabaron las secuencias ------");
        
    }
}