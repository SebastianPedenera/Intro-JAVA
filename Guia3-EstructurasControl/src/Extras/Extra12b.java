/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

/**
 *
 * @author Usuario
 */
public class Extra12b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String primero, segundo, tercero;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    /*primero = String.valueOf(i);
                    //if (primero.equals("3")) {
                     //   primero = "E";
                    //}
                    segundo = String.valueOf(j);
                    //    segundo = "E";
                    //}
                    tercero = String.valueOf(k);
                    //if (tercero.equals("3")) {
                      //  tercero = "E";
                    //}
                    String cadena = primero + " - " + segundo + " - " + tercero;
                    cadena = cadena.replace("3", "E");
                    System.out.println(cadena);
*/
                    primero = (i == 3) ? "E" : String.valueOf(i);
                    segundo = (j == 3) ? "E" : Integer.toString(j);
                    tercero = (k == 3) ? "E" : Integer.toString(k);
                    String cadena = primero + " - " + segundo + " - " + tercero;
                    System.out.println(cadena);
                }
            }
        }
    }
}
