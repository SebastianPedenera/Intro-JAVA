package Servicio.Extra1;

import Entidades.Extra1.Raices;
import java.util.Scanner;

public class RaicesServicio {

    Scanner leer = new Scanner(System.in);
    double discriminante;
    boolean si, yes;
    double positivo, negativo;
    
    public double getDiscriminante(Raices raiz) {
        //(b^2)-4*a*c
        discriminante = (Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC();
        return discriminante;
    }
    
    public boolean tieneRaices() {
        if (discriminante >= 0) {
            si = true;
            System.out.println("Tiene dos soluciones");
        } else {
            si = false;
            System.out.println("No tiene dos soluciones");
        }
        return si;
    }

    public boolean tieneRaiz() {
        if (discriminante == 0) {
            yes = true;
            System.out.println("Tiene una solucion");
        } else {
            yes = false;
            System.out.println("No tiene");
        }
        return yes;
    }

    public void obtenerRaices(Raices raiz) {
        tieneRaices();
        if (si == true) {
            positivo = (-raiz.getB() + Math.sqrt((Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC())) / (2 * raiz.getA());
            negativo = (-raiz.getB() - Math.sqrt((Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC())) / (2 * raiz.getA());
            System.out.println(positivo);
            System.out.println(negativo);
        }
    }

    public void obtenerRaiz(Raices raiz) {
        tieneRaiz();
        if (yes == true) {
            positivo = (-raiz.getB() + Math.sqrt((Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC())) / (2 * raiz.getA());
            System.out.println(positivo);
        }
    }      

    public void calcular(Raices raiz) {
        tieneRaiz();
        tieneRaices();
        if (si == true) {
            obtenerRaices(raiz);
        } else if (yes == true) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("No tiene solucion");
        }
    }

}

/*
    Otra forma de resolverse:
    
    public double getDiscriminante(Raices raiz) {
        double discriminante = Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC();
        return discriminante;
    }
    // devuelve un booleano indicando si tiene dos soluciones, 
    // para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(Raices raiz) {
        double discriminante = getDiscriminante(raiz);
        if (discriminante >= 0) {
            return true;
        } else {
            return false;
        }
    }
    // devuelve un booleano indicando si tiene una única solución, 
    // para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raices raiz) {
        double discriminante = getDiscriminante(raiz);
        if (discriminante == 0) {
            return true;
        } else {
            return false;
        }
    }
    //llama a tieneRaíces() y si devolvió true, imprime las 2 posibles soluciones.
    public Raices obtenerRaices(Raices raiz) {
        double discriminante = getDiscriminante(raiz);
        double raiz1 = (-raiz.getB() + Math.sqrt(discriminante)) / (2 * raiz.getA());
        double raiz2 = (-raiz.getB() - Math.sqrt(discriminante)) / (2 * raiz.getA());
        if (tieneRaices(raiz)) {
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else {
            System.out.println("No tiene raices.");
        }
        return null;
    }
 */
