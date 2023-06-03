package Entidades;

public final class Gato extends Animal {

    private String color;

    public Gato(String color, String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.color = color;
    }
    
    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
     @Override
    public void alimentar(){
        System.out.println("Gato: "+this.nombre + " se alimenta de " + this.alimento);
    }
    
}
