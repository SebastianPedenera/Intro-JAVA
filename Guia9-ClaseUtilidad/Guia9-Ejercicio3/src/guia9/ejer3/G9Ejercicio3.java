package guia9.ejer3;

import ArregloService.ArregloService;

public class G9Ejercicio3 {

    public static void main(String[] args) {

        double[] array1 = new double[5];
        double array2[] = new double[20];

        ArregloService arregloS = new ArregloService();
        
        arregloS.inicializarA(array1);
        arregloS.mostrar(array1);
        arregloS.ordenar(array1);
        arregloS.mostrar(array1);
        arregloS.inicializarB(array1, array2);
        arregloS.mostrar(array2);

    }

}
