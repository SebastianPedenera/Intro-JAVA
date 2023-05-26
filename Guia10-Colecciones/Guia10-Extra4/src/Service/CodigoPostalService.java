package Service;

import Entidad.CodigoPostal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodigoPostalService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    CodigoPostal codPostal = new CodigoPostal();

    Map<Integer, String> ciudades = new HashMap();

    public Map<Integer, String> cargarCiudades() {
        Integer cp;
        String ciudad;
        String respuesta;
        do {
            System.out.println("Ingrese el Codigo Postal");
            codPostal.setCodigoPostal(sc.nextInt());
            cp = codPostal.getCodigoPostal();
            System.out.println("Ingrese Ciudad");
            codPostal.setCiudad(sc.next());
            ciudad = codPostal.getCiudad();
            ciudades.put(cp, ciudad);

            System.out.println("Desea agregar otra ciudad? s/n");
            respuesta = sc.next();
        } while (respuesta.equalsIgnoreCase("s"));
        return new HashMap<>(ciudades);
    }

    public void mostrar() {
        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            System.out.println("Ciudad : " + entry.getValue() + " Codigo Postal : " + entry.getKey());
        }
    }

    public void buscarCiudad() {
        System.out.println("Ingrese el codigo postal de la ciudad a buscar");
        Integer cp = sc.nextInt();
        if (ciudades.containsKey(cp)) {
            System.out.println("La ciudad fue encontrada: " + ciudades.get(cp));
        } else {
            System.out.println("El codigo postal y la ciudad no se encuentran");
        }
    }

    public void agregarCiudad() {
        System.out.println("Ingrese el Codigo Postal");
        Integer cp = sc.nextInt();
        System.out.println("Ingrese Ciudad");
        String ciudad = sc.next();
        ciudades.put(cp, ciudad);
    }

    public void eliminar() {
        System.out.println("Ingrese el cp de la ciudad a eleminar");
        Integer opcion =sc.nextInt();
        ciudades.remove(opcion);
    }

}
