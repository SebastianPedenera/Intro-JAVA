package Main;

import java.util.Scanner;

public class Guia9Extra1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        String mesSecreto = meses[(int) (Math.random() * 12)];
        System.out.println(mesSecreto);
        String mesUsuario = "";
        do {
            System.out.println("Adivine el mes secreto");
            mesUsuario = sc.next();

        } while (!mesUsuario.equalsIgnoreCase(mesSecreto));

        if (mesUsuario.equalsIgnoreCase(mesSecreto)) {
            System.out.println("¡Has acertado!");
        }

        /*
        do {
            String messi = sc.next().toLowerCase();
            if (mesSecreto.equals(messi)) {
                System.out.println("CORRECTO");
                break;
            } else {
                System.out.println("Inténtelo nuevamente");
            }
        } while (true);
         */
    }

}
