package vectores;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Vectores1 {
    //  Escribe un programa que permita introducir los valores de un vector de
    //  diez elementos numéricos y luego imprimirlos.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("Introduce diez valores");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        
    }
}
