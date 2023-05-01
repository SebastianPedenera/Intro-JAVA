package Servicio.Ejercicio1;

import Entidades.Ejercicio1.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicio {
    
    Scanner leer = new Scanner(System.in);
    CuentaBancaria ajuste = new CuentaBancaria();
            
    public CuentaBancaria crearCuenta(){
       
        System.out.println("ingrese el numero de cuenta asignado");
        ajuste.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese dni");
        ajuste.setDniCliente(leer.nextInt());
        System.out.println("ingrese saldo actual");
        ajuste.setSaldoActual(leer.nextFloat());
        
        return ajuste;
          
    }
    
    public float ingresarDinero(float ingreso){
        float dinero = ajuste.getSaldoActual();
        dinero += ingreso;
        ajuste.setSaldoActual(dinero);
        return dinero;
    }
    
    public void mostrarDinero(){
          System.out.println(ajuste.getSaldoActual());
    }
    
}
/* public class CuentaBancariaService {
    private Scanner leer = new Scanner(System.in);
    CuentaTres cuenta = new CuentaTres();
    public CuentaTres crearCuenta(){
        System.out.println("ingrese el numero de cuenta asignado");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese dni");
        cuenta.setDniCliente(leer.nextInt());
        System.out.println("ingrese saldo actual");
        cuenta.setSaldoActual((int) leer.nextFloat());
        return cuenta;
    }
    public float ingresarDinero(float ingreso){
       float dinero = cuenta.getSaldoActual();
       dinero += ingreso;
        cuenta.setSaldoActual((int) dinero);
        return dinero;
    }
    public void mostrarDinero(){
        System.out.println(cuenta.getSaldoActual());
    }
} */
