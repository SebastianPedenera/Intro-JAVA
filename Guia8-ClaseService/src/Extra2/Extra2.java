
package Extra2;

import Entidades.Extra2.NIF;
import Servicio.Extra2.NIFService;

public class Extra2 {

    public static void main(String[] args) {
        NIFService service = new NIFService ();
        NIF usuario1 = service.crearNIF();
        service.mostrar(usuario1);
    }
    
}
