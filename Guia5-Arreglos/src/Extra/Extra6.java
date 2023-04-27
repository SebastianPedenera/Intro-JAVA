package Extra;

import java.util.Scanner;
public class Extra6 {

    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

        char sopa[][] = new char [20][20];
        String palabra;
        int aleat;
        System.out.println("Ingrese 5 palabras de 3 a 5 caracteres");
        
        for (int i = 0; i < 4; i++) {
            aleat = (int) (Math.random()*10);
    
            do {                
                palabra = sc.next();
            } while (palabra.length() > 5 || palabra.length() < 3);

            for (int j = 0; j < palabra.length(); j++) {
                sopa[aleat][j] = palabra.charAt(j);
            }
        }
            System.out.println("******************************");
            
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                if (sopa[i][j] == '\u0000') {
                    sopa[i][j] = (char) ('0' + (Math.random()*10));
                }

                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
        }
    }
}