package Entidades;

public class PersonaExtra {
   private String nombrePersona;
   private String apellido;
   private int edadPersona; 
   private int dni;
   private PerroExtra perro;

    public PersonaExtra() {
    }

    public PersonaExtra(String nombrePersona, String apellido, int edadPersona, int dni) {
        this.nombrePersona = nombrePersona;
        this.apellido = apellido;
        this.edadPersona = edadPersona;
        this.dni = dni;
        this.perro = null;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public PerroExtra getPerro() {
        return perro;
    }

    public void setPerro(PerroExtra perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombrePersona + ", Apellido: " + apellido + ", Edad: " + edadPersona + ", DNI: " + dni + ", perro: " + perro ;
    }
   
   
}
