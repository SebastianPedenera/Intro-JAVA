package Main;

import Service.AlumnoService;
import java.util.Scanner;

public class Guia10Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        AlumnoService alumnoList = new AlumnoService();
        
        alumnoList.crearAlumno();
        alumnoList.notaFinal();
        
    }
    
}

