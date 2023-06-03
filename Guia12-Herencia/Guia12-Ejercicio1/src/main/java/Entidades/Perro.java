package Entidades;

public final class Perro extends Animal {
    
    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void alimentar(){
        System.out.println("Perro: "+this.nombre + " se alimenta de " + this.alimento);
    }
}
