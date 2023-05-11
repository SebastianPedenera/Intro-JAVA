package Service;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    Scanner sc = new Scanner(System.in);

    public Ahorcado crearJuego() {
        Ahorcado juego = new Ahorcado();
        System.out.println("Ingrese la palabra a buscar");
        String palabra = sc.next();
        String[] auxiliar = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            auxiliar[i] = palabra.substring(i, i + 1);
        }
        juego.setPalabra(auxiliar);
        System.out.println("Ingrese la cantidad de intentos");
        juego.setIntentos(sc.nextInt());
        return juego;
    }

    public void longitud(Ahorcado juego) {
        System.out.println("la longitud de la palabra: " + juego.getPalabra().length);
    }

    public boolean buscar(Ahorcado juego, String letra) {
        boolean encontrado = false;

        String auxiliar[] = juego.getPalabra();

        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (auxiliar[i].equals(letra)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public boolean encontradas(Ahorcado juego, String letra) {

        int cont = 0;
        //int contaux=0;

        boolean encontrar = buscar(juego, letra);

        if (!encontrar) {
            /*
            contaux=juego.getIntentos()-1;
            juego.setIntentos(contaux);
             */
            juego.setIntentos(juego.getIntentos() - 1);
            /*
            intentos -=1; //lo dicho anteriormente si llega a la long de la palabra secreta
                System.out.println("le quedan "+intentos+" intentos");
                ahorcado.setJugadasMax(intentos);
             */
        }

        String auxiliar[] = juego.getPalabra();
        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (auxiliar[i].equals(letra)) {
                cont++;
            }
        }

        juego.setCantidadLetrasEncontradas(cont + juego.getCantidadLetrasEncontradas());
        System.out.println("La cantidad de letras encontradas es : " + juego.getCantidadLetrasEncontradas());
        System.out.println("Las letras que faltan son : " + (juego.getPalabra().length - juego.getCantidadLetrasEncontradas()));
        System.out.println("¿La tetra estaba? " + encontrar);

        return encontrar;
    }

    public void intentos(Ahorcado juego) {
        System.out.println("la cantidad de intentos que le quedan son: " + juego.getIntentos());
    }

    public void juego(Ahorcado juego) {

        System.out.println("Ingrese una letra");
        String letra = String.valueOf(sc.next().charAt(0));
        longitud(juego);
        buscar(juego, letra);
        encontradas(juego, letra);
        intentos(juego);
    }
}
