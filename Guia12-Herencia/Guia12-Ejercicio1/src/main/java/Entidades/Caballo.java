package Entidades;

public final class Caballo extends Animal {

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

     @Override
    public void alimentar(){
        System.out.println("Caballo: "+this.nombre + " se alimenta de " + this.alimento);
    }
}
