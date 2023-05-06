package Main;

import Entidad.ParDeNumeros;
import Service.ParDeNumeroService;

public class G9Ejercicio2{

    public static void main(String[] args) {

        ParDeNumeros numeros = new ParDeNumeros();
        ParDeNumeroService ns = new ParDeNumeroService();
        ns.mostrarValores(numeros);
        ns.devolverMayor(numeros);
        ns.calculaRaiz(numeros);
        ns.calcularPotencia(numeros);

    }

}
