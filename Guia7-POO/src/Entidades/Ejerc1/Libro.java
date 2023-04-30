/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título
, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro 
y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario 
y luego informar mediante otro método el número de ISBN,
el título, el autor del libro y el número de páginas.
 */
package Entidades.Ejerc1;

import java.util.Scanner;

public class Libro {

    public String nombre;
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int Pagina;
    
    public Libro(){
        
    }

    public Libro(String ISBN, String Titulo, String Autor, int Pagina, String nombre) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Pagina = Pagina;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getPagina() {
        return Pagina;
    }

    public void setPagina(int Pagina) {
        this.Pagina = Pagina;
    }
    
    public void crearLibro(){
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el ISBN"); 
        ISBN = leer.nextLine();
        System.out.println("Ingrese el Titulo"); 
        Titulo= leer.nextLine();
        System.out.println("Ingrese el Autor"); 
        Autor = leer.nextLine();
        System.out.println("Ingrese la cantidad de paginas"); 
        Pagina = leer.nextInt();
      
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Pagina=" + Pagina + '}';
    }
  
    
}
