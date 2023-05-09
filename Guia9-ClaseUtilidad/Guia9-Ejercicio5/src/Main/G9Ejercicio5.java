package Main;

import Entidad.Persona;
import Service.PersonaService;

public class G9Ejercicio5 {

    public static void main(String[] args) {
        
        PersonaService servicio = new PersonaService();
        Persona p1 = servicio.crearPersona();
        servicio.mostrarPersona(p1);
    }
    
}
