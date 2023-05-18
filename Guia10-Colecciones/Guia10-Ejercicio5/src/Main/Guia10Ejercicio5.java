package Main;

import Service.PaisService;

public class Guia10Ejercicio5 {

    public static void main(String[] args) {

        PaisService paisServ = new PaisService();
        paisServ.fabricaPaises();
        paisServ.mostrarPaises();
        paisServ.eliminarPais();
        paisServ.mostrarPaises();
    }
}
