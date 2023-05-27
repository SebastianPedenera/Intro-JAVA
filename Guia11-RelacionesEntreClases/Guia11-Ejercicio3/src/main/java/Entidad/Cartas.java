package Entidad;

import Enumeracion.Palos;

public class Cartas {

    private Integer numeros;
    private Palos palos;
    
    
    public Cartas() {
    }

    public Cartas(Integer numeros, Palos palos) {
        this.numeros = numeros;
        this.palos = palos;
    }

    public Integer getNumeros() {
        return numeros;
    }

    public void setNumeros(Integer numeros) {
        this.numeros = numeros;
    }

    public Palos getPalos() {
        return palos;
    }

    public void setPalos(Palos palos) {
        this.palos = palos;
    }

    @Override
    public String toString() {
        return numeros + " de " + palos ;
    }
    
}
