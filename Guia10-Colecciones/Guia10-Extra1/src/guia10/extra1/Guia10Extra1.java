package guia10.extra1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guia10Extra1 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList();

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num;
        do {            
            System.out.println("Ingresar numeros y finaliza con el -99");
            num= sc.nextInt();
            numeros.add(num);
        } while (num !=-99);
        
        for (Integer aux : numeros) {
            System.out.println(">" + aux);
        }
    }
    
}
