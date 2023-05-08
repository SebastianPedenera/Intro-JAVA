package fechaService;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner sc = new Scanner(System.in);
    
    public Date fechaNacimiento(){
        
        System.out.println("Ingrese el año");
        int anio = sc.nextInt();
        System.out.println("Ingrese el mes");
        int mes = sc.nextInt();
        System.out.println("Ingrese el dia");
        int dia = sc.nextInt();
        
    return new Date(anio-1900,mes-1,dia); 
    }
    
    public Date fechaActual(){
    return new Date();
    }
    
    public void diferencia(Date fechaActual, Date fechaNacimiento){
        int diferencia = Math.abs(fechaActual.getYear()- fechaNacimiento.getYear());
        System.out.println("La diferencia es: " + diferencia);
    }
    
    public int diferencia2(Date fechaNacimiento, Date fechaActual) {
        int anios = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > fechaActual.getMonth() ||
           (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            anios--;
        }
        return anios;
    }
    
    public int diferencia3(Date fechaNacimiento, Date fechaActual) {
        long diff = fechaActual.getTime() - fechaNacimiento.getTime();
        long diffYears = diff / (24 * 60 * 60 * 1000) / 365; // calcula la diferencia en años
        return (int) diffYears;
    }
    
}
