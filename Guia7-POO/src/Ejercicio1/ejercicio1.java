package Ejercicio1;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título
, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro 
y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario 
y luego informar mediante otro método el número de ISBN,
el título, el autor del libro y el número de páginas.
 */
import Entidades.Ejerc1.Libro;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Libro terror = new Libro();
        // Public
        terror.nombre = "nombrex";
        terror.nombre = "dfaf";
        // Private

        terror.setAutor("nombresss");
        System.out.println(terror);

        Libro matematicas;
        matematicas = new Libro();
        System.out.println(matematicas);
        matematicas.crearLibro();
        System.out.println(matematicas);
        System.out.println(terror);

        Libro ficcion = new Libro("2558", "sssss", "aaaaaa", 200, "sdfa");
        System.out.println(ficcion);

    }

}
