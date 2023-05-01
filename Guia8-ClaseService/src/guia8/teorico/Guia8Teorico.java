
package guia8.teorico;


import Servicio.Teorico.PersonaService;

public class Guia8Teorico {

    public static void main(String[] args) {
        
       PersonaService p1 = new PersonaService();
                     
       p1.mostrarPersona(p1.crearPersona());
           
    }
    
}
