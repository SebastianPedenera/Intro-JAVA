package Main;

import Entidad.Cadena;
import Service.CadenaService;

public class G9Ejercicio1 {

    public static void main(String[] args) {

        CadenaService cs = new CadenaService();
        Cadena c1 = cs.crearFrase();
        cs.mostrarMenu(c1);
    }

}
