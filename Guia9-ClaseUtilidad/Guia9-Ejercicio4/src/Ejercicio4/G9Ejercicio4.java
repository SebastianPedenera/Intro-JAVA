package Ejercicio4;

import fechaService.FechaService;
import java.util.Date;

public class G9Ejercicio4 {

    public static void main(String[] args) {

        FechaService fS = new FechaService();
        Date usuario = fS.fechaNacimiento();
        Date fechaActual = fS.fechaActual();
        /// Diferencia por año
        System.out.println("Diferencia en años entre la fecha actual y la introducida: ");
        fS.diferencia(usuario, fechaActual);
        /// Diferencia por año comparando la diferencia de meses y dia
        System.out.println("Diferencia en meses y dias entre la fecha actual y la introducida: ");
        System.out.println(fS.diferencia2(usuario, fechaActual));
        /// Diferencia por segundos 
        System.out.println("Diferencia en segundos entre la fecha actual y la introducida: ");
        System.out.println(fS.diferencia3(usuario, fechaActual));
    }
}
