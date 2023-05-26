package Main;

import Entidad.CantanteFamoso;
import java.util.ArrayList;

import java.util.Scanner;

public class Guia10Extra2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList();

        System.out.println("Ingrese 5 cantantes Famosos: ");
        int cantidad = 5;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del cantante: " + (i + 1));
            String nombre = sc.next();
            System.out.println("Ingrese el nombre del disco: ");
            String disco = sc.next();
            listaCantantes.add(new CantanteFamoso(nombre, disco));
        }

        for (CantanteFamoso aux : listaCantantes) {
            System.out.println(aux);
        }

        int opcion;
        boolean salir = false;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar cantante");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar cantante");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cantante: ");
                    sc.nextLine(); // Limpiar el buffer del scanner
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el disco con más ventas: ");
                    String discoConMasVentas = sc.nextLine();
                    listaCantantes.add(new CantanteFamoso(nombre, discoConMasVentas));
                    System.out.println("Cantante agregado correctamente.");
                    break;
                case 2:
                    System.out.println("Lista de cantantes:");
                    for (CantanteFamoso cantante : listaCantantes) {
                        System.out.println("Nombre: " + cantante.getNombre() + ", Disco con más ventas: " + cantante.getDisco());
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el índice del cantante a eliminar (1-" + listaCantantes.size() + "): ");
                    int indice = sc.nextInt();
                    if (indice >= 1 && indice <= listaCantantes.size()) {
                        CantanteFamoso cantanteEliminado = listaCantantes.remove(indice - 1);
                        System.out.println("Cantante eliminado: " + cantanteEliminado.getNombre());
                    } else {
                        System.out.println("Índice inválido. No se eliminó ningún cantante.");
                    }
                    break;
                case 4: //Salir
                    salir = true;
                    break;
            }
        } while (!salir);

    }
}
