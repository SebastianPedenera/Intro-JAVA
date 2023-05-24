package Entidades;

public class Revolver {

    private Integer posicionActual;
    private Integer posicionAgua;
    
    public void llenarRevolver(){
        this.posicionActual = (int) (Math.random()*7);
        this.posicionAgua = (int) (Math.random()*7);
    }
    
    public boolean mojar(){
        return posicionActual == posicionAgua;
    }
    
    public void siguienteChorro(){
        if (posicionActual==6) {
            posicionActual= 1;
        }else
            posicionActual++;
    }
    

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
      
}
