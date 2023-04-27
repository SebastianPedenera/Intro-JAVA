/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package Extra;

public class Extra2 {

    public static void main(String[] args) {
        int[] vector1 = new int[3];
        int[] vector2 = new int[3];
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) (Math.random() * 10);
            System.out.print(" " + vector1[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = (int) (Math.random() * 10);
            System.out.print(" " + vector2[i]);
        }
        System.out.println(" ");
        boolean test = true;
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Los vectores son diferentes");
                test = false;
                break;
            }
        }
        if (test) {
            System.out.println("Los vectores son iguales");
        }
    }
}
