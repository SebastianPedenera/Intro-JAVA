package Service;

import Entidad.Cartas;
import Enumeracion.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CartasService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Cartas> cartas = new ArrayList();
    ArrayList<Cartas> cartasDadas = new ArrayList();

    public void crearMaso() {
        if (cartas.size() > 0) {
            System.out.println(" Ya se creó el maso");
        } else {
            int[] numero = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
            for (Palos palo : Palos.values()) {
                for (int num : numero) {
                    cartas.add(new Cartas(num, palo));
                }
            }
            System.out.println("Se ha creado la baraja");
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Cartas siguienteCarta() {
        Cartas aux = new Cartas();
        if (cartas.size() == 0) {
            System.out.println("No hay mas cartas");
        } else {
            aux = cartas.get(0);
        }
        return aux;
    }

    public void cartasDisponible() {
        System.out.println("Cartas disponible " + cartas.size());
    }

    public void darCartas() {
        System.out.println("¿Cuantas cartas quiere?");
        int cantidad = sc.nextInt();
        int cont = 0;
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas");
        } else {
            while (cont < cantidad) {
                System.out.println("Se le dió la carta: " + siguienteCarta());
                cartasDadas.add(cartas.get(0));
                cartas.remove(0);
                cont++;
            }
        }
    }

    public void cartasMonton() {
        System.out.println("El total de cartas dadas son: " + cartasDadas.size());
        for (Cartas carta : cartasDadas) {
            System.out.println("Carta: " + carta);
        }
    }

    public void mostrarBarajas() {
        for (Cartas carta : cartas) {
            System.out.println(carta);
        }
    }

    public void menu() {

        int menu = 0;
        do {
            System.out.println("1. Crear baraja");
            System.out.println("2. Mezclar baraja");
            System.out.println("3. Dar cartas");
            System.out.println("4. Mostrar cartas del monton");
            System.out.println("5. Cartas disponibles");
            System.out.println("6. Mostrar baraja");
            System.out.println("7. Salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("*--------------------------*");
                    crearMaso();
                    break;
                case 2:
                    System.out.println("*--------------------------*");
                    barajar();
                    break;
                case 3:
                    System.out.println("*--------------------------*");
                    darCartas();
                    break;
                case 4:
                    System.out.println("*--------------------------*");
                    cartasMonton();
                    break;
                case 5:
                    System.out.println("*--------------------------*");
                    cartasDisponible();
                    break;
                case 6:
                    System.out.println("*--------------------------*");
                    mostrarBarajas();
                    break;
                case 7:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("*--------------------------*");
        } while (menu != 7);

    }

}
