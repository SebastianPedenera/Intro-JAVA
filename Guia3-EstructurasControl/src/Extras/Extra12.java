/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package Extras;

public class Extra12 {

    public static void main(String[] args) {
        int num;
        String pri, seg, ter;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    pri = String.valueOf(i);
                    seg = String.valueOf(j);
                    ter = String.valueOf(k);
                    if (i==3) {
                        pri = "E";
                    }
                       if (j==3) {
                        seg = "E";
                    }
                       if (k==3) {
                        ter = "E";
                    }
                    System.out.println( pri + "-" + seg + "-" + ter);
                }
            }
        }
    }
}
