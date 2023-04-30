/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un Juego de 
adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
después de cada intento. El Juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Extra3;

import Entidades.Extra3.Juego;

public class Guia7Extra3 {

    public static void main(String[] args) {

        Juego j1 = new Juego();

        j1.iniciar_juego();

    }

}
