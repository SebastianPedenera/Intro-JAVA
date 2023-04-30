/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un Juego de 
adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
después de cada intento. El Juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Entidades.Extra3;

import java.util.Scanner;

public class Juego {
    
    public  int num1;
    public  int num2;
    
    public void iniciar_juego(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego de Adivinanzas");
        System.out.println("Ingrese el número del jugador 1: ");
        this.num1=sc.nextInt();
        
        System.out.println("Intente adividar el número, ustede tiene 3 intentos");
        boolean adivina=false;
        int cont=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Intento : " +(i+1));
            num2=sc.nextInt();
            cont++;
            if (num1==num2) {
                adivina=true;
                break;
            }
            if (num2<num1) {
                System.out.println("Es mayor al número que ingresaste");
            }
             if (num2>num1) {
                System.out.println("Es menor al número que ingresaste");
            }
        }
        if (adivina) {
            System.out.println("Adivinaste en el intento :" + cont );
        }else
            System.out.println("Se acabaron los intentos");
    }
    
}
