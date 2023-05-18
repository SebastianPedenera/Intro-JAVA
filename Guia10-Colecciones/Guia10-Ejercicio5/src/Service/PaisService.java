package Service;

import Entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PaisService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Set<Pais> paises = new TreeSet();

    public Pais crearPais() {
        System.out.print("Ingrese nombre país: ");
        String nombre = sc.next();
        return new Pais(nombre);
    }

    public void fabricaPaises() {
        String opc;
        do {
            paises.add(crearPais());
            do {
                System.out.print("Desea agregar otro país (S/N): ");
                opc = sc.next();

            } while (!(opc.equalsIgnoreCase("S") || opc.equalsIgnoreCase("N")));
        } while (opc.equalsIgnoreCase("S"));
    }

    public void mostrarPaises() {
        for (Pais elemento : paises) {
            System.out.println(elemento);
        }
    }

    public void eliminarPais() {

        System.out.print("Ingrese un nombre país a eliminar: ");
        String paisEliminar = sc.next();

        boolean eliminado = false;
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(paisEliminar)) {
                it.remove();
                eliminado = true;
                break;
            }
        }
        if (eliminado) {
            System.out.println("El país " + paisEliminar + " fue eliminado.");
        } else {
            System.out.println("El país no se encuentra");
        }
    }

}