package vista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import logica.Cesar;

/**
 *
 * @author Mao
 */
public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char[] desci;

        Cesar cesar = new Cesar();

        System.out.println("Texto a cifrar");
        String texto = entrada.nextLine();
        System.out.println("Desplazamiento para el cifrado.(numero entero)");
        int desp = entrada.nextInt();
        System.out.println("Texto: " + texto);
        System.out.println("Texto cifrado: " + cesar.cifrar(texto, desp));
        String msj = cesar.cifrar(texto, desp);

        desci = cesar.descifrar(msj, desp);
        System.out.print("Texto descifrado: ");
        for (int i = 0; i < desci.length; i++) {
            System.out.print(desci[i]);
        }
        System.out.println();
    }

}
