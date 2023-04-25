/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package guia.pkg4.ejercicios;

import java.util.Scanner;


public class Ejercicio1b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Ingrese dos números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String opc;
        do {
        System.out.println("Ingrese A para sumar");
        System.out.println("Ingrese B para restar");
        System.out.println("Ingrese C para multiplicar");
        System.out.println("Ingrese D para dividir");
        System.out.println("Ingrese E para salir");
        opc = sc.next();
        opc = opc.toUpperCase();
           if (!opc.equals("E")) {
           menu(opc, num1, num2);    
           }
        } while (!opc.equals("E"));
    }
    
    public static void  menu(String opc, int a, int b ) {
        switch (opc) {
            case "A":
                System.out.println("La suma es: " + suma(a,b));
                break;
            case "B":
                System.out.println("La resta es: " + resta(a,b));
                break;
            case "C":
                System.out.println("La multiplicacion es: " + multi(a,b));
                break;
            case "D":
                System.out.println("La División es: " + div(a,b));
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }
    public static int suma(int a, int b){
    return a+b; }
    
    public static int resta(int a, int b){
    return a-b; }
    
    public static int multi(int a, int b){
    return a*b; }
    
    public static int div(int a, int b){
    return a/b; }
}
