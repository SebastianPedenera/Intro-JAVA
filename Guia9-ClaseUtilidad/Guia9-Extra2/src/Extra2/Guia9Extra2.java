package Extra2;

import Entidad.Ahorcado;
import Service.AhorcadoService;

public class Guia9Extra2 {

    public static void main(String[] args) {
        
        AhorcadoService as = new AhorcadoService();
        
        Ahorcado juego = as.crearJuego();
                       
        do {
            as.juego(juego);
                    
        } while (juego.getIntentos() != 0 && juego.getCantidadLetrasEncontradas() != juego.getPalabra().length);
        
        if (juego.getIntentos() == 0) {
            System.out.println(" Alpiste  ");
        }
        if (juego.getCantidadLetrasEncontradas() == juego.getPalabra().length) {
            System.out.println(" Ganaste pescauu  ");
        }
        
    }
    
}
