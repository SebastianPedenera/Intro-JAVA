package Entidades;

import Enumeraciones.RazaExtra;

public class PerroExtra {
    
    private String nombre;
    private RazaExtra raza;
    private int edad;
    private String tamanio; 
    private boolean adoptado;

    public PerroExtra() {
    adoptado=false;
    }

    public PerroExtra(String nombre, RazaExtra raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.adoptado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RazaExtra getRaza() {
        return raza;
    }

    public void setRaza(RazaExtra raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + ", Tamaño: " + tamanio + ", Adoptado: " + adoptado;
    }
    
    
}