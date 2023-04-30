/*
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado 
al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y 
se devuelve el resultado al main.

 */
package Entidades.Ejerc3;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Operacion {

    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese en número 1 ");
        //se puede poner solamente num1 ya que no hay ambiguedad(no hay otras variables con el mismo nombre)
        this.num1 = sc.nextDouble();
        System.out.println("Ingrese en número 2 ");
        //se puede poner solamente num2 ya que no hay ambiguedad(no hay otras variables con el mismo nombre)
        this.num2 = sc.nextDouble();
    }

    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicar() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error");
        }
        return num1 * num2;
    }

    public double dividir() {
        if (num2 == 0) {
            System.out.println("Error no se puede dividir por cero");
            return 0;
        }
        return num1 / num2;
    }

}
