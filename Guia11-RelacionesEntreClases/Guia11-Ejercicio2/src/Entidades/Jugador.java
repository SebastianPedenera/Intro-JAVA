package Entidades;

public class Jugador {
    
    private Integer id;
    private String nombre;
    private Boolean mojado;

    public Jugador() {
    }
 
    public Jugador(Integer id) {
        this.nombre = "Jugador " + id;
        this.mojado=false;
    }
    
    public boolean disparo(Revolver r){
        
        mojado = r.mojar(); //false / verdadero
        
        if (!mojado) {
            r.siguienteChorro();
        } 
        
        return mojado;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
}
