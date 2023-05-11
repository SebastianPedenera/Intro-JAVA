package guia10.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Guia10Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razas = new ArrayList<>();
        
        String opcion;
        
        // Lee y guarda la razas de perros con un while 
        do {
            System.out.println("Ingrese la raza del perro");
            razas.add(sc.next());
            System.out.println("Usted quisiera agregar otra raza? (si/no)");
            opcion = sc.next();
        } while (!opcion.equalsIgnoreCase("no"));
        
        // Muestra la ArrayList
        System.out.println("--------------------------");
        for (String raza : razas) {
            System.out.println(raza);
        }
        
        // Muestra la ArrayList ordenada
        System.out.println("--------------------------");
        System.out.println("Lista ordenada");
        
        Collections.sort(razas);
        // For each (mejorado)
        for (String elemento : razas) {
            System.out.println(elemento);
        }
        
        // Uso de Iterator para eliminar un elemento
        Iterator<String> it = razas.iterator();
        System.out.println("Cual raza quiere eliminar de la lista: ");
        String quitar = sc.next();
        boolean encontrado = false;
        
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(quitar)) {
                it.remove();
                encontrado = true;
            }
        }
        System.out.println("--------------------------");
        if (!encontrado) {
            System.out.println("La raza buscada no se encuentra en la lista");
        }

        // Muestra el ArrayList con la eliminacion (For Tradicional)
        for (int i = 0; i < razas.size(); i++) {
            System.out.println(razas.get(i));
        }

        System.out.println("---- Finalizada la ejecución ----");
    }

}
