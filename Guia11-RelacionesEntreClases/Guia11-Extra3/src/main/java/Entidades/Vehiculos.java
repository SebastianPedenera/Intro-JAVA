package Entidades;

import Enum.TipoVehiculo;

public class Vehiculos {
    
    private String marca;
    private String modelo;
    private int anio;
    private int numMotor;
    private int numChasis;
    private String color;
    private TipoVehiculo tipo; //Urban, Sedan, pickup, suv, coupe 

    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo, int anio, int numMotor, int numChasis, String color, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numMotor = numMotor;
        this.numChasis = numChasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public int getNumChasis() {
        return numChasis;
    }

    public void setNumChasis(int numChasis) {
        this.numChasis = numChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  "\n marca: " + marca + 
                "\n modelo: " + modelo + 
                "\n año: " + anio + 
                "\n numero del motor: " + numMotor + 
                "\n numero del chasis: " + numChasis + 
                "\n color: " + color + 
                "\n tipo:" + tipo;
    }
    
}
