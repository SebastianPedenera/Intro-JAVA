package Ejercicio2;

import Entidades.Ejer2.Circunferencia;



/*
 Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 */

public class Guia7Ejercicio2 {

    public static void main(String[] args) {
       
        Circunferencia rueda = new Circunferencia(15);
        
        System.out.println("El radio es:"+rueda.getRadio()+" el area es: "+rueda.area()+" y el perimetro es: "+rueda.perimetro());
        
        Circunferencia rueda2 = new Circunferencia(0);
        rueda2.crearCircunferencia();
        System.out.println("El radio es:"+rueda2.getRadio()+" el area es: "+rueda2.area()+" y el perimetro es: "+rueda2.perimetro());

    }
    
}
