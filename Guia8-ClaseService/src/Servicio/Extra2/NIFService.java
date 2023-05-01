
package Servicio.Extra2;

import Entidades.Extra2.NIF;
import java.util.Scanner;

public class NIFService {
    
    Scanner leer = new Scanner(System.in);
    public NIF crearNIF(){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; 
        System.out.println("Ingrese su nro de DNI.");
        long dni = leer.nextLong();
        double resto = dni % 23;
        char letra = letras[(int) resto];
    return new NIF(dni, letra);
    }
    
    public void mostrar(NIF nif1){
        System.out.println(nif1.getDni()+"-"+nif1.getLetra());
    }
}

    /*
    Otra forma de resolverse:
    
    Scanner leer = new Scanner(System.in);
    long calc;
    String encontrarLetra;

    public Nif CrearNif() {
        Nif n = new Nif();
        System.out.println("Ingrese número de DNI: ");
        n.setDni(leer.nextLong());
        calc = n.getDni() % 23;
        String letras[] = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        for (int i = 0; i < calc + 1; i++) {
            if (calc == i) {
                encontrarLetra = letras[i];
            }
        }
        return n;
    }

    public void mostrar(Nif n) {
        System.out.println(n.getDni() + "" + this.encontrarLetra);

    }
    */