/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia.pkg3.extra;

public class Extra02 {

    public static void main(String[] args) {
        int A = 1, B = 2, C = 3, D = 4, Aux;
        System.out.println("El número A: " + A);
        System.out.println("El número B: " + B);
        System.out.println("El número C: " + C);
        System.out.println("El número D: " + D);
        System.out.println("Los valores intercambiados son: ");
        Aux = B;
        B = C;
        C = A;
        A = D;
        D = Aux;
        System.out.println("El número A: " + A);
        System.out.println("El número B: " + B);
        System.out.println("El número C: " + C);
        System.out.println("El número D: " + D);
    }

}
