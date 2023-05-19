package Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ProductosService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> producto = new HashMap();

    public void agregarProducto() {
        boolean salir = true;
        String opcion;
        do {
            System.out.println("Ingrese un producto");
            String nombre = sc.next().toLowerCase();
            System.out.println("Introduzca el precio del producto");
            Double precio = sc.nextDouble();
            producto.put(nombre, precio);
            System.out.println("Desea salir (s/n)");
            opcion = sc.next();
            if (opcion.equalsIgnoreCase("s")) {
                salir = false;
            }
        } while (salir);
        System.out.println("");
    }

    public void modificarPrecio() {
        System.out.println("Ingrese el producto que desea modificar el precio");
        String modificar = sc.next().toLowerCase();
        double nuevoPrecio = 0;
        for (String aux : producto.keySet()) {
            if (modificar.equals(aux)) {
                System.out.println("Ingrese el precio nuevo");
                nuevoPrecio = sc.nextDouble();
                producto.replace(modificar, nuevoPrecio);
            }
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el producto a eliminar");
        String Nombre = sc.next().toLowerCase();
        if (producto.containsKey(Nombre)) {
            producto.remove(Nombre);
            System.out.println("El producto se elimino");
        } else {
            System.out.println("El producto no se encuentra en la lista");
        }
    }
    
    // Opción de eliminar con Iterator:
    public void eliminarProducto2() {
        Iterator<Map.Entry<String, Double>> it = producto.entrySet().iterator();
        System.out.println("Que producto desea eliminar?");
        String productoBuscar = sc.next().toLowerCase();
        while (it.hasNext()) {
            if (productoBuscar.equalsIgnoreCase(it.next().getKey())) {
                producto.remove(productoBuscar);
            }
        }
    }

    public void mostrarProductos() {
        for (Map.Entry<String, Double> entry : producto.entrySet()) {
            System.out.println("Producto :" + entry.getKey() + " Precio " + entry.getValue());
        }
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("1. Introducir un producto");
            System.out.println("2. Modificar el precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar los productos con su precio");
            System.out.println("5. Salir");
            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();
            System.out.println("-----------------------------------------");
            System.out.println(" ");
            switch (opcion) {
                case 1:
                    agregarProducto();
                    System.out.println("-----------------------------------------");
                    System.out.println(" ");
                    break;
                case 2:
                    modificarPrecio();
                    System.out.println("-----------------------------------------");
                    System.out.println(" ");
                    break;
                case 3:
                    eliminarProducto();
                    System.out.println("-----------------------------------------");
                    System.out.println(" ");
                    break;
                case 4:
                    mostrarProductos();
                    System.out.println("-----------------------------------------");
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("------ Usted ha salido del menu ---------");
                    System.out.println("-----------------------------------------");
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}
