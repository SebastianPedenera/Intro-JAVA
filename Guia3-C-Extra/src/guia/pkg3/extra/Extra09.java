package guia.pkg3.extra;

import java.util.Scanner;

public class Extra09 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese el dividendo");
     int dividendo = leer.nextInt();
     System.out.println("Ingrese el divisor");
     int divisor = leer.nextInt();
     //int aux = dividendo-divisor;
     int resto = dividendo;
     int i = 0;
     
     do {
         resto = resto - divisor;
         i++ ;
     }while(resto >= divisor);
        System.out.println("El cociente "+i+" y el resto es "+resto);
    }
}
