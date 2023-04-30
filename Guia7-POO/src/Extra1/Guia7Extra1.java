/*
 Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá́definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
 */
package Extra1;

import Entidades.Extra1.Cancion;

public class Guia7Extra1 {

    public static void main(String[] args) {
        // se crea el objeto y se ingresa los valores con un constructor de parametros
        Cancion c1 = new Cancion("Escaloneta", "dimaria");
        System.out.println(c1);
    }
}
