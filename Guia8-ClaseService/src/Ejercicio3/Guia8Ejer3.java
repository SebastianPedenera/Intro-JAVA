package Ejercicio3;

import Servicio.Ejercicio3.PersonaServicio;
import java.util.Scanner;

public class Guia8Ejer3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PersonaServicio p1 = new PersonaServicio();
        PersonaServicio p2 = new PersonaServicio();
        PersonaServicio p3 = new PersonaServicio();
        PersonaServicio p4 = new PersonaServicio();

        System.out.println("Ingrese los datos de la primer persona: ");
        p1.crearPersona();
        if (p1.esMayorDeEdad() == true) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        if (p1.calcularIMC() == -1) {
            System.out.println("Esta por debajo de su peso ideal");
        } else if (p1.calcularIMC() == 0) {
            System.out.println("Esta en su peso ideal");
        } else if (p1.calcularIMC() == 1) {
            System.out.println("Esta con sobrepeso");
        }

        System.out.println("Ingrese los datos de la segunda persona: ");
        p2.crearPersona();
        if (p2.esMayorDeEdad() == true) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        if (p2.calcularIMC() == -1) {
            System.out.println("Esta por debajo de su peso ideal");
        } else if (p2.calcularIMC() == 0) {
            System.out.println("Esta en su peso ideal");
        } else if (p2.calcularIMC() == 1) {
            System.out.println("Esta con sobrepeso");
        }

        System.out.println("Ingrese los datos de la tercer persona: ");
        p3.crearPersona();
        if (p3.esMayorDeEdad() == true) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        if (p3.calcularIMC() == -1) {
            System.out.println("Esta por debajo de su peso ideal");
        } else if (p3.calcularIMC() == 0) {
            System.out.println("Esta en su peso ideal");
        } else if (p3.calcularIMC() == 1) {
            System.out.println("Esta con sobrepeso");
        }

        System.out.println("Ingrese los datos de la cuarta persona: ");
        p4.crearPersona();
        if (p4.esMayorDeEdad() == true) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        if (p4.calcularIMC() == -1) {
            System.out.println("Esta por debajo de su peso ideal");
        } else if (p4.calcularIMC() == 0) {
            System.out.println("Esta en su peso ideal");
        } else if (p4.calcularIMC() == 1) {
            System.out.println("Esta con sobrepeso");
        }
        double peso[] = new double[4];
        boolean mayor[] = new boolean[4];

        peso[0] = p1.calcularIMC();
        peso[1] = p2.calcularIMC();
        peso[2] = p3.calcularIMC();
        peso[3] = p4.calcularIMC();

        mayor[0] = p1.esMayorDeEdad();
        mayor[1] = p2.esMayorDeEdad();
        mayor[2] = p3.esMayorDeEdad();
        mayor[3] = p4.esMayorDeEdad();
        
        promedio(peso);
        mayorEdad(mayor);

    }

    public static void promedio(double peso[]) {
        int debajo = 0, ideal = 0, sobre = 0;
        double promdebajo, promideal, promsobre;
        for (int i = 0; i < peso.length; i++) {
            if (peso[i] == -1) {
                debajo++;
            }
            if (peso[i] == 0) {
                ideal++;
            }
            if (peso[i] == 1) {
                sobre++;
            }
        }
        promdebajo = debajo * 100 / peso.length;
        promideal = ideal * 100 / peso.length;
        promsobre = sobre * 100 / peso.length;
        System.out.println("El porcentaje debajo del peso ideal es: " + promdebajo);
        System.out.println("El porcentaje de peso ideal es: " + promideal);
        System.out.println("El porcentaje de sobrepeso es: " + promsobre);
    }

    public static void mayorEdad(boolean mayor[]) {
        int edadMayor = 0, edadMenor = 0;
        int promMayor, promMenor;
        for (int i = 0; i < mayor.length; i++) {
            if (mayor[i] == true) {
                edadMayor++;
            }
            if (mayor[i] == false) {
                edadMenor++;
            }
        }
        promMayor = edadMayor * 100 / mayor.length;
        promMenor = edadMenor * 100 / mayor.length;
        System.out.println("El promedio de mayor edad es: " + promMayor);
        System.out.println("El promedio de menor edad es: " + promMenor);
    }

}
