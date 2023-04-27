/*
 Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
 */
package Extras;

import java.util.Scanner;

public class Extra09b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0, dividendo, divisor, residuo=0;
        do {            
            System.out.println("Ingrese dos números enteros mayores de 1");
            dividendo = sc.nextInt();
            divisor = sc.nextInt();
        } while (dividendo <1 && divisor<1);
        residuo = dividendo;
        do {            
            residuo = residuo-divisor;
            cont++;
        } while (residuo > divisor);
        System.out.println("La división de " +dividendo+ " dividido " +divisor+ " es igual a: el residuo " +residuo+ " y el cociente "+cont);
    }
}
