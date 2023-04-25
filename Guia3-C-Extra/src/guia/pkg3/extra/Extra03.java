/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.extra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra;
        do {
            System.out.println("Ingrese una letra: ");
            letra = sc.next();
        } while (letra.length() != 1);
        if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada es una VOCAL");
        } else { 
            System.out.println("La letra ingresada NO es una VOCAL");
        }
       
            
    }
    
    }
    

