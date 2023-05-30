package Entidades;

import Enum.Coberturas;
import java.util.Date;

public class Cuotas {
    
    private int numCuotas;
    private int montoCuota;
    private boolean paga;
    private int vencimiento;
    private String formaPago;

    public Cuotas() {
    }

    public Cuotas(int numCuotas, int montoCuota, boolean paga, int vencimiento, String formaPago) {
        this.numCuotas = numCuotas;
        this.montoCuota = montoCuota;
        this.paga = paga;
        this.vencimiento = vencimiento;
        this.formaPago = formaPago;
    }

    public int getNumCuotas() {
        return numCuotas;
    }

    public void setNumCuotas(int numCuotas) {
        this.numCuotas = numCuotas;
    }

    public int getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(int montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    public int getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(int vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "numero de cuotas: " + numCuotas + 
               "\n monto de la cuota: " + montoCuota + 
               "\n vencimiento: " + vencimiento + 
               "\n formaPago: " + formaPago ;
    }
    
    
}
