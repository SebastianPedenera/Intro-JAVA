package Ejercicio1;


import Servicio.Ejercicio1.CuentaBancariaServicio;
import java.util.Scanner;

public class Guia8Ejercicios {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        CuentaBancariaServicio c1 = new CuentaBancariaServicio();
        c1.crearCuenta();
        c1.ingresarDinero(100);
        System.out.println("   +++      ");
        c1.mostrarDinero();
        
    }
    
}

