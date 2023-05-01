package Extra1;

import Entidades.Extra1.Raices;
import Servicio.Extra1.RaicesServicio;

import java.util.*;


public class Ejercicio1 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        RaicesServicio R1 = new RaicesServicio();
        Raices raiz = new Raices(leer.nextInt(),leer.nextInt(),leer.nextInt());
        System.out.println(R1.getDiscriminante(raiz));
        System.out.println(R1.tieneRaices());
        System.out.println(R1.tieneRaiz());
        R1.obtenerRaices(raiz);
        R1.obtenerRaiz(raiz);
        
    }
    
}

/*
double discriminante = Math.pow(b, 2) - 4 * a * c;
if (discriminante < 0) {
    // La ecuación no tiene raíces reales
} else if (discriminante == 0) {
    // La ecuación tiene una única raíz real
    double raiz = -b / (2 * a);
} else {
    // La ecuación tiene dos raíces reales
    double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
    double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
}
*/