package Service.Ejercicio1;


import Entidad.Ejercicio1.Cadena;
import java.io.IOException;
import java.util.Scanner;

public class CadenaService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    public Cadena crearFrase() {
        System.out.print("Ingresar frase: ");
        String frase = input.nextLine();
        return new Cadena(frase);
    }
    public void mostrarVocales(Cadena c) {
        int cont = 0;
        String vocales = "AEIOUaeiou";
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);
            if (vocales.contains(letra)) {
                cont++;
            }
        }
        System.out.println("Vocales contabilizadas: " + cont);
    }
    public void invertirFrase(Cadena c) {
        String fraseInvertida = "";
        for (int i = c.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += c.getFrase().substring(i, i + 1);
        }
        System.out.println("Frase normal: " + c.getFrase());
        System.out.println("Frase invertida: " + fraseInvertida);
    }
    public void vecesRepetido(Cadena c, String letraUsuario) {
        letraUsuario = letraUsuario.toUpperCase();
        String frase = c.getFrase().toUpperCase();
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (frase.substring(i, i + 1).contains(letraUsuario)) {
                cont++;
            }
        }
        System.out.println("El caracter '" + letraUsuario + "' se repite " + cont + " veces.");
    }
    public void compararLongitud(Cadena c, String fraseUsuario) {
        if (c.getLongitud() == fraseUsuario.length()) {
            System.out.println("Las frases tienen la misma longitud.");
        } else {
            System.out.println("Las frases no tienen la misma longitud.");
        }
    }
    public void unirFrases(Cadena c, String fraseUsuario) {
        String frase = c.getFrase();
        frase += fraseUsuario;
        System.out.println("Frases unificadas: " + frase);
    }
    public void reemplazar(Cadena c, String letraUsuario) {
        //String fraseReemplazada = f.getFrase().replace("A", letraUsuario).replace("a", letraUsuario);
        String fraseReemplazada = "";
        String vocales = "Aa";
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);
            if (vocales.contains(letra)) {
                fraseReemplazada += letraUsuario;
            } else {
                fraseReemplazada += letra;
            }
        }
        System.out.println(fraseReemplazada);
    }
    public boolean contiene(Cadena c, String letraUsuario) {
        boolean contiene = false;
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);
            if (letraUsuario.contains(letra)) {
                contiene = true;
                break;
            }
        }
        return contiene;
    }
    public void mostrarMenu(Cadena c) {
        String fraseUsuario = "";
        String letraUsuario = "";
        String salir = "";
        int opc;
        do {
            System.out.print("\nMENÚ\n"
                    + "1. Mostrar vocales.\n"
                    + "2. Invertir frase.\n"
                    + "3. Veces repetido.\n"
                    + "4. Comparar longitud.\n"
                    + "5. Unir frases.\n"
                    + "6. Reemplazar.\n"
                    + "7. Contiene.\n"
                    + "8. Salir.\n"
                    + "> ");
            opc = input.nextInt();
            limpiarPantalla();
            switch (opc) {
                case 1:
                    mostrarVocales(c);
                    break;
                case 2:
                    invertirFrase(c);
                    break;
                case 3:
                    System.out.print("Ingresar letra.\n> ");
                    letraUsuario = input.next();
                    vecesRepetido(c, letraUsuario);
                    break;
                case 4:
                    System.out.print("Ingresar frase.\n> ");
                    fraseUsuario = input.next();
                    compararLongitud(c, fraseUsuario);
                    break;
                case 5:
                    System.out.print("Ingresar frase.\n> ");
                    fraseUsuario = input.next();
                    unirFrases(c, fraseUsuario);
                    break;
                case 6:
                    System.out.print("Ingresar letra.\n> ");
                    letraUsuario = input.next();
                    reemplazar(c, letraUsuario);
                    break;
                case 7:
                    System.out.print("Ingresar letra.\n> ");
                    letraUsuario = input.next();
                    System.out.println(contiene(c, letraUsuario));
                    break;
                case 8:
                    do {
                        System.out.print("¿Esta seguro que desea salir? S/N\n> ");
                        salir = input.next();
                        if (salir.equalsIgnoreCase("S")) {
                            limpiarPantalla();
                            System.out.println("¡Hasta pronto!");
                            break;
                        } else if (salir.equalsIgnoreCase("N")) {
                            limpiarPantalla();
                            System.out.println("Volver al menú.");
                            esperarTecla();
                            break;
                        } else {
                            System.out.print("Opción no disponible. Intente nuevamente.\n> ");
                        }
                    } while (true);
                    break;
                default:
                    System.out.print("Opción no disponible. Intente nuevamente.\n> ");
                    break;
            }
        } while (!salir.equalsIgnoreCase("S"));
    }
    public void esperarTecla() {
        boolean esperandoEnter = true;
        System.out.print("\nPresione Enter para continuar.\n> ");
        while (esperandoEnter) {
            try {
                // Leer el siguiente byte del flujo de entrada del sistema
                int entrada = System.in.read();
                // Comprobar si el byte leído es igual al código ASCII de Enter
                if (entrada == '\n') {
                    limpiarPantalla();
                    esperandoEnter = false; // Salir del bucle
                }
            } catch (IOException e) {
            }
        }
    }
    public void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }
}

/* Otra opcion de resolver el ejercicio:
//  Ejemplo para invertir frase
    public void invertirFrase(Cadena fra) {
        for (int i = fra.getLongi()-1; i >= 0; i--) {
            System.out.print(fra.getFrase().substring(i, i + 1));
        }
        System.out.println("");
    }
    ///  Unir frase
    public static void unirFrases(Cadena cadena, String frase) {
        System.out.println("La frase resultante de unir ambas frases es: " + cadena.getFrase() + " " + frase);
    }
    /// reemplazar
    public void reemplazar(Cadena fra){
        System.out.println("Por quecaracter queres reemplazar las a");
        String car = sc.next();
        String frase1 = fra.getFrase();
        String frase2 = frase1.replace("a", car).replace("A", car);
        System.out.println(frase2);
    }
    /// Contiene
    boolean conti = false;
    int j = 0;
    System.out.println("Ingrese la letra que quiere encontrar");
    String letra = sc.next();
    for (int i = 0; i < fra.getLongi(); i++) {
        if (fra.getFrase().equalsIgnoreCase(letra)) {
            j++;
        }
    }
    if (fra.getFrase().contains(letra)) {
        conti = true;
    }
    System.out.println(conti);
    return conti;    
    }
    El método indexOf() devuelve el índice, 
    dentro del objeto String que realiza la llamada, 
    de la primera ocurrencia del valor especificado, 
    comenzando la búsqueda desde indiceDesde ; o -1 si no se encuentra dicho valor.
    public static boolean contiene(Cadena cadena, char letra) {
        return cadena.getFrase().indexOf(letra) != -1;
    }
*/

/* Otra opcion de resolver el ejercicio:
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void mostrarVocales(Cadena cadena) {
    //deberá contabilizar la cantidad de vocales que tiene la frase ingresada
        int contadorVocales = 0;
        char letra;
        String frase = cadena.getFrase();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("Cantidad de vocales: " + contadorVocales);
        System.out.println();
    }
    public void invertirFrase(Cadena cadena) {
        String fraseOri = cadena.getFrase();
        String fraseNueva = "";
        char letra;
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            letra = fraseOri.charAt(i);
            fraseNueva = fraseNueva.concat(String.valueOf(letra));
        }
        System.out.println("Frase invertida: " + fraseNueva);
        System.out.println();
    }
    public void vecesRepetido(Cadena cadena) {
        System.out.println("Letra a buscar para contar veces que se repite:");
        String letraBuscada = String.valueOf(leer.next().charAt(0));
        String frase = cadena.getFrase();
        int cont = 0;
        char letra;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = frase.charAt(i);
            if (letraBuscada.equalsIgnoreCase(String.valueOf(letra))) {
                cont++;
            }
        }
        System.out.println("Letra " + "'" + letraBuscada + "'" + " cantidad de veces repetida: " + cont);
        System.out.println();
    }
    public void compararLongitud(Cadena cadena) {
        System.out.println("Ingrese una nueva frase para comparar las longitudes: ");
        String fraseNueva = leer.nextLine();
        if (fraseNueva.length() == cadena.getFrase().length()) {
            System.out.println("Las longitudes son iguales");
        } else {
            System.out.println("Las longitudes son diferentes");
        }
    }
    public void unirFrases(Cadena cadena) {
    // deberá unir la frase contenida en la clase Cadena con una nueva frase 
    // ingresada por el usuario y mostrar la frase resultante.
        System.out.println("Ingrese una nueva frase para concatenarlas: ");
        String fraseUsuario = leer.nextLine();
        String fraseNueva = cadena.getFrase().concat(fraseUsuario);
        System.out.println("Frase resultante: " + fraseNueva);
        System.out.println();
    }
    public void reemplazar(Cadena cadena) {
    //deberá reemplazar todas las letras “a” que se encuentren en la frase, por 
    // algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
        System.out.println("Ingrese el valor por el cual desea reemplazar las letras 'a':");
        String letra = leer.next();
        String frase = cadena.getFrase();
        frase = frase.replace("a", letra);
        System.out.println("Resultado: ");
        System.out.println(frase);
        System.out.println();
    }
    public void contiene(Cadena cadena) {
    // deberá comprobar si la frase contiene una letra que ingresa el usuario y 
    // devuelve verdadero si la contiene y falso si no.
        String frase = cadena.getFrase();
        System.out.println("Letra a buscar dentro de la frase: ");
        char letraBuscada = leer.next().charAt(0);
        char letra;
        boolean contiene = false;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = frase.charAt(i);
            if (letra == letraBuscada) {
                contiene = true;
                break;
            }
        }
        if (contiene) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
    }
    */