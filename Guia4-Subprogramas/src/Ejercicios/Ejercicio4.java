package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in);
        System.out.println("Ingresar numero");
        int numero= leer.nextInt();
       boolean primo = esPrimo(numero);
        System.out.println(primo);
}
  public static boolean esPrimo (int numero){
      boolean valor = false ;
     int contador = 0;
      for (int i = 1; i <= numero; i++) {
          if (numero%i==0) {
              contador++;
          }
      }
      if (contador==2) {
          valor = true;
      }
      return valor;
  }
}  