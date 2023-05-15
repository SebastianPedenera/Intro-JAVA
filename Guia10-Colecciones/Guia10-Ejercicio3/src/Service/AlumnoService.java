package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    Scanner sc= new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos= new ArrayList<>();
    
    public ArrayList<Alumno> crearAlumno() {
       String opcion;
        do {
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese el nombre");
            String nombre = sc.next();
            System.out.println("Ingrese las tres notas");
            notas.add(sc.nextInt());
            notas.add(sc.nextInt());
            notas.add(sc.nextInt());
            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);
            System.out.println("Quiere continuar? s/n");
            opcion = sc.next();
        } while (!opcion.equalsIgnoreCase("n"));
        return alumnos;
    }
    
    public double notaFinal(){
        System.out.println("Ingrese el nombre a buscar:");
        String nombre=sc.next();
        double suma=0,cont=0, promedio;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                for (Integer nota : alumno.getNotas()) {
                    suma+= nota;
                    cont++;
                }
            }
        }
        promedio=suma/cont;
        System.out.println("El promedio de las notas es: " + promedio);
        return promedio; 
    }
    
}
