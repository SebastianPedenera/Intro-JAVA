package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
        this.revolver = new Revolver();
        this.jugadores = new ArrayList();
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.revolver = r;
    }

    public void cargarJugadores() {

        System.out.println("Ingrese la cantidad de jugadores entre 1 y 6");
        int cantidad = sc.nextInt();
        if (cantidad > 6) {
            cantidad = 6;
        }
        for (int i = 0; i < cantidad; i++) {
            Jugador jug = new Jugador(i + 1);
            jugadores.add(jug);
        }

    }

    public void ronda() {

        cargarJugadores();
        revolver.llenarRevolver(); //math atributos
        System.out.println(revolver.toString());
        boolean perdedor;
        int intentos = 6; //cantidad de lugares
        int j, cont = 0;
        int jugador = jugadores.size();
        System.out.println("------------------------");        
        for (int i = 0; i < intentos; i++) {
            if (jugador > i) {
                j = i;
            } else {
                j = cont;
            }
            perdedor = jugadores.get(j).disparo(revolver);
            if (perdedor) {
                System.out.println(" El jugador mojado es: " + jugadores.get(j).getNombre());
                System.out.println("----------------------");
                System.out.println("El juego ha terminado");
                break;
            } else {
                System.out.println("El jugador " + jugadores.get(j).getNombre() + " se ha salvado");
            }
            cont++;
            if (cont == jugador) {
                cont = 0;
            }
        }
    }
}
