package ArregloService;

import java.util.Arrays;

public class ArregloService {

    /// 1) inicializar
    public void inicializarA(double array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 10;
        }
    }

    /// 2) Mostrar
    public void mostrar(double array[]) {
        System.out.println(Arrays.toString(array));
    }

    ///3) Ordenar el Vector
    public void ordenar(double array[]) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            double guardar = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = guardar;
        }
    }

    ///3) Opción2
    public void ordenar2(double array[]) {
        Arrays.sort(array);
        double guardar[] = new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            guardar[i] = array[j];
            j++;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = guardar[i];
        }
    }

    /// 3) Opción 3
    public void ordenar3(double array[]) {
        Arrays.sort(array);
        double guardar[] = new double[array.length];
        for (int i = 0, j = guardar.length - 1; j >= 0; i++, j--) {
            guardar[i] = array[j];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = guardar[i];
        }
    }

    /// 3) Opción 4
    public void ordenar4(double array[]) {
        Arrays.sort(array);
        double guardar[] = new double[array.length];
        for (int i = 0, j = guardar.length - 1; i < array.length; i++, j--) {
            guardar[i] = array[j];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = guardar[i];
        }
    }

    /// 3) Opción 5
    public void ordenar5(double array[]) {
        Arrays.sort(array);
        double guardar[] = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            guardar[i] = array[array.length - 1 - i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = guardar[i];
        }
    }

    /// 4) Inicializar B
    public void inicializarB(double arrayA[], double arrayB[]) {
        for (int i = 0; i < arrayB.length / 2; i++) {
            arrayB[i] = arrayA[i];
        }
        Arrays.fill(arrayB, 10, 20, 0.5);
    }
}
