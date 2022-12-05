package vectores;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Vectores2 {
//        Escribe un programa que permita introducir un vector de diez
//        elementos alfanuméricos y luego visualizar los que ocupen la posición par.
//        Repetir para los de posición impar.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] elementos = new String[10];

        System.out.println("Introduce diez valores");
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = teclado.nextLine();
        }
        System.out.println("Impares:");
        for (int i = 0; i < elementos.length; i += 2) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println("\nPares:");
        for (int i = 1; i < elementos.length; i += 2) {
            System.out.print(elementos[i] + " ");
        }

    }
}
