package Service;

import Entidad.ParDeNumeros;

public class ParDeNumeroService {

    public void mostrarValores(ParDeNumeros num) {
        System.out.println(num.toString());
    }
    /* opc2:
    public void mostrarValores(ParDeNumeros numeros){
        System.out.println("Numero 1: "+numeros.getNum1());
        System.out.println("Numero 2: "+numeros.getNum2());
    }
     */

    public double devolverMayor(ParDeNumeros num) {
        return Math.max(num.getNum1(), num.getNum2());
    }
    /* opc2:
    public void devolverMayor(ParDeNumeros numeros){
        if (numeros.getNum1()>numeros.getNum2()){
            System.out.println("El mayor es: "+numeros.getNum1());
        }else {
            System.out.println("El mayor es: "+numeros.getNum2());
        }
    }
     */

    public void calcularPotencia(ParDeNumeros num) {
        double calc;
        if (num.getNum1() == devolverMayor(num)) {
            calc = Math.pow(Math.round(num.getNum1()), Math.round(num.getNum2()));
        } else {
            calc = Math.pow(Math.round(num.getNum2()), Math.round(num.getNum1()));
        }
        System.out.println("El mayor elevado al menos es " + calc);
    }
    /* opc2:
    public void calcularPotencia(ParDeNumeros numeros){
        if (numeros.getNum1()>numeros.getNum2()){
            System.out.println(numeros.getNum1()+" elevado a "+numeros.getNum2());
            System.out.println(Math.pow(numeros.getNum1(), numeros.getNum2()));
        }else {
            System.out.println(numeros.getNum2()+" elevado a "+numeros.getNum1());
            System.out.println(Math.pow(numeros.getNum2(), numeros.getNum1()));
        }
    }
     */

    public void calculaRaiz(ParDeNumeros num) {
        double calc;
        if (num.getNum1() == devolverMayor(num)) {
            calc = Math.sqrt(Math.abs(num.getNum2()));
        } else {
            calc = Math.sqrt(Math.abs(num.getNum1()));
        }
        System.out.println("La raiz cuadrada del menor numero es: " + calc);
    }
    /* opc2:
    public void calculaRaiz(ParDeNumeros numeros){
        if (numeros.getNum1()>numeros.getNum2()){
            double raizCuadrada = Math.sqrt(numeros.getNum1());
            System.out.println("Raiz de : "+numeros.getNum1()+" "+raizCuadrada);
        }else {
            double raizCuadrada = Math.sqrt(numeros.getNum2());
            System.out.println("Raiz de : "+numeros.getNum2()+" "+raizCuadrada);
        }
    }
     */

}
