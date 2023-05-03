package Main;

import Entidad.Ejercicio1.Cadena;
import Service.Ejercicio1.CadenaService;

public class Ejercicio1 {

    public static void main(String[] args) {

        CadenaService cs = new CadenaService();
        Cadena c1 = cs.crearFrase();
        cs.mostrarMenu(c1);
    }

}
