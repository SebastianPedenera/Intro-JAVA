package Main;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Extra3_Libros {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashSet<Libro> book = new HashSet<>();
        String titulo;
        String autor;
        int ejemplares;
        boolean salir = false;
        do {
            System.out.println("\nManejo de libreria. Elegir opcion: ,\n"
                    + "\n1__AGREGAR LIBRO"
                    + "\n2__PRESTAR LIBRO"
                    + "\n3__DEVOLVER LIBRO"
                    + "\n4__MOSTRAR LISTA DE LIBROS"
                    + "\n5__SALIR\n");
            int opc = leer.nextInt();
            switch (opc) {
                case 1: // Agregar Libro
                    System.out.print("Titulo: ");
                    titulo = leer.next();
                    System.out.print("Autor:  ");
                    autor = leer.next();
                    System.out.print("Cantidad de ejemplares:  ");
                    ejemplares = leer.nextInt();
                    book.add(new Libro(titulo, autor, ejemplares));
                    break;
                case 2:// Prestar Libro
                    boolean existe = false;
                    System.out.println("Que libro desea que le presten?");
                    String presta = leer.next();
                    for (Libro libro : book) {
                        if (presta.equalsIgnoreCase(libro.getTitulo())) {
                            existe = true;
                            if (libro.prestamo()) {
                                System.out.println("Se efectua el prestamo de:" + libro.getTitulo());
                                System.out.println("Los ejemplares remanentes son: "
                                        + "" + (libro.getEjemplares() - libro.getPrestados()));
                                break;
                            } else {
                                System.out.println("No quedan ejemplares disponibles");
                                break;
                            }
                        }
                    }
                    if (!existe) {
                        System.out.println("El titulo no se encuentra en el inventario");
                        break;
                    }
                    break;
                case 3: // Devolver Libro
                    boolean esta = false;
                    System.out.println("Que libro va a devolver?");
                    String devolver = leer.next();
                    for (Libro libro : book) {
                        if (devolver.equalsIgnoreCase(libro.getTitulo())) {
                            esta = true;
                            if (libro.devolucion()) {
                                System.out.println("Se efectua la devolucion de:" + libro.getTitulo());
                                System.out.println("Los ejemplares remanentes son: "
                                        + "" + (libro.getEjemplares() - libro.getPrestados()));
                                break;
                            } else {
                                System.out.println("No se puede devolver un libro que no se ha prestado");
                                break;
                            }
                        }
                    }
                    if (!esta) {
                        System.out.println("El titulo no se encuentra en el inventario");
                        break;
                    }
                    break;
                case 4: // Mostrar Lista de Libros
                    TreeSet<Libro> libros = new TreeSet(book);
                    for (Libro libro : libros) {
                        System.out.println(libro);
                    }
                    break;
                case 5: //Salir
                    salir = true;
                    break;
            }
        } while (!salir);
    }

}
