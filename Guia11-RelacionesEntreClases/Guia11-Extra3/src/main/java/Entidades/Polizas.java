package Entidades;

import Enum.Coberturas;

public class Polizas {

    private Vehiculos vehiculoPoliza;
    private Clientes clientePoliza;
    private int numPoliza;
    private int inicioPoliza;
    private int finPoliza;
    private Cuotas cantCuotas;
    //private String formaPago;
    private int montoTotalAsegurado;
    private boolean granizo;
    private int montoMaxGranizo;
    private Coberturas Cobertura; //Total, contraTerceros..

    public Polizas() {
    }

    public Polizas(Vehiculos vehiculoPoliza, Clientes clientePoliza, int numPoliza, int inicioPoliza, int finPoliza, Cuotas cantCuotas, int montoTotalAsegurado, boolean granizo, int montoMaxGranizo, Coberturas Cobertura) {
        this.vehiculoPoliza = vehiculoPoliza;
        this.clientePoliza = clientePoliza;
        this.numPoliza = numPoliza;
        this.inicioPoliza = inicioPoliza;
        this.finPoliza = finPoliza;
        this.cantCuotas = cantCuotas;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizo = granizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.Cobertura = Cobertura;
    }

    public Vehiculos getVehiculoPoliza() {
        return vehiculoPoliza;
    }

    public void setVehiculoPoliza(Vehiculos vehiculoPoliza) {
        this.vehiculoPoliza = vehiculoPoliza;
    }

    public Clientes getClientePoliza() {
        return clientePoliza;
    }

    public void setClientePoliza(Clientes clientePoliza) {
        this.clientePoliza = clientePoliza;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public int getInicioPoliza() {
        return inicioPoliza;
    }

    public void setInicioPoliza(int inicioPoliza) {
        this.inicioPoliza = inicioPoliza;
    }

    public int getFinPoliza() {
        return finPoliza;
    }

    public void setFinPoliza(int finPoliza) {
        this.finPoliza = finPoliza;
    }

    public Cuotas getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Cuotas cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public int getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(int montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(int montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public Coberturas getCobertura() {
        return Cobertura;
    }

    public void setCobertura(Coberturas Cobertura) {
        this.Cobertura = Cobertura;
    }

    @Override
    public String toString() {
        return "Poliza: " + 
                "\n Vehiculo: " + vehiculoPoliza + 
                "\n Cliente: " + clientePoliza + 
                "\n Numero de Poliza: " + numPoliza + 
                "\n Inicio Poliza: " + inicioPoliza + 
                "\n Fin de la Poliza: " + finPoliza + 
                "\n cantidad de Cuotas: " + cantCuotas + 
                "\n Monto Total Asegurado: " + montoTotalAsegurado + 
                "\n Seguro contra Granizo: " + granizo + 
                "\n Monto Maximo de Granizo: " + montoMaxGranizo + 
                "\n Cobertura: " + Cobertura;
    }
    
    
}
