/*
a- Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
b-  Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
    Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
    El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
c- Método vaciarCafetera(): pone la cantidad de café actual en cero. 
d -Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package Servicio.Ejercicio2;

import Entidades.Ejercicio2.Cafetera;
import java.util.Scanner;

public class CafeteraService {
    
    Scanner sc = new Scanner(System.in);
    Cafetera cafe = new Cafetera(1000, 0);
    
    public int llenaCafetera(){
        System.out.println("Ingrese la cantidad actual: ");
        cafe.setCantidadActual(sc.nextInt());
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
    return cafe.getCapacidadMaxima();
    }
    
    public int servirTaza(){
        System.out.println("Ingrese el tamaño de la taza vacia:");
        int tazaV = sc.nextInt();
        if (cafe.getCantidadActual()<tazaV) {
            System.out.println("No alcanza para llenar la taza, se usara: " + cafe.getCantidadActual());
            cafe.setCantidadActual(0);
        }else {
            cafe.setCantidadActual(cafe.getCantidadActual()-tazaV);
            System.out.println("Se sirvio la taza y queda: " + cafe.getCantidadActual());
        }
      return tazaV;  
    }
    
    public void vaciarCafetera(){
        cafe.setCantidadActual(0);
        System.out.println("La cafetera esta vacia");
    }
    
    public void agregarCafe(){
        System.out.println("Ingrese la cantidad de cafe: ");
        int agregar = sc.nextInt();
        cafe.setCantidadActual(cafe.getCantidadActual()+agregar);
        if (cafe.getCantidadActual()>cafe.getCapacidadMaxima()) {
            System.out.println("Supera la capaidad maxima");
            cafe.setCantidadActual(cafe.getCapacidadMaxima());
        }
    }
            
    public void mostrar() {
        System.out.println("La cantida actual es: " +cafe.getCantidadActual());
        System.out.println("La capacidad maxima es: " +cafe.getCapacidadMaxima());
    }
}

/*
    Otra forma de resolver:

    public int llenarCafetera(Cafetera cafetera) {
        System.out.println("Se llenó la cafetera");
        return cafetera.getCapacidadMaxima();
    }
    public void servirTaza(Cafetera cafetera) {
        System.out.println("Indique el tamaño de la taza en ml:");
        int taza = leer.nextInt();
        if (taza > cafetera.getCantidadActual()) {
            System.out.println("No había suficiente café para llenar la taza");
            System.out.println("Se llenó con " + cafetera.getCantidadActual() + " ml");
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("Se llenó la taza");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
        }
    }
    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("Se vació la cafetera");
    }
    //Le ponemos agua para hacer más café
    public void agregarCafe(Cafetera cafetera) {
        System.out.println("Ingrese la cantidad de agua a agregar en ml:");
        int agua = leer.nextInt();
        int restante = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
        if (agua <= restante) {
            System.out.println("Se agregó " + agua + " ml de agua");
            cafetera.setCantidadActual(cafetera.getCantidadActual() + agua);
        } else {
            System.out.println("La cantidad excede a la capacidad máxima");
        }
    }
    */