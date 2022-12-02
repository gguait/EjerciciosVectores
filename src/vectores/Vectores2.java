/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Vectores2 {

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
