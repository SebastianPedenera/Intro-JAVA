package Teoria;

import EntidadesTeorico.Persona;

public class Teoria1 {

    public static void main(String[] args) {
        
        Persona p1 = new Persona("Pablo", "Moyano", 36);
        Persona p2 = new Persona("Agustina", "Lucero");
        
        System.out.println("El nombre es "+p1.getNombre()+". El apellido es " +p1.getApellido()+" y la edad es "+p1.getEdad()); 
        System.out.println("El nombre es "+p2.getNombre()+". El apellido es " +p2.getApellido()+" y la edad es "+p2.getEdad());  
        System.out.println(p1);
        System.out.println(p2.toString());
        
    }
    
}
