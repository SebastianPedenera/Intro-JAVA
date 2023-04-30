/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto
puntos usando un método crearPuntos() que le pide al usuario los dos números y los 
ingresa en los atributos del objeto. Después, a través de otro método calcular y 
devolver la distancia que existe entre los dos puntos que existen en la clase Puntos. 
Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */

package Entidades.Extra2;

import java.util.Scanner;

public class Punto {

public double  x1;
public double  x2;
public double  y1;
public double  y2;

public void crearPuntos(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el primer punto:");
    System.out.println("La cordenada x1:");
    this.x1= sc.nextDouble();
    System.out.println("La cordenada y1:");
    this.y1= sc.nextDouble();
    System.out.println("Ingrese el segundo punto:");
    System.out.println("La cordenada x2:");
    this.x2= sc.nextDouble();
    System.out.println("La cordenada y2:");
    this.y2= sc.nextDouble();
}

public double calculo(){
return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)); 
}
    
}
