/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author pabmar
 */
public class Ejercicio6 {
//        Escribe un programa que permita introducir vector de diez elementos
//        numéricos, visualizarlo y luego indicar cuales elementos son pares y
//        ocupan una posición par, indicar contenido y posición.
//        Repetir para contenido múltiplo de tres y posición impar.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int[] vector = {1,2,412,4,5,6,7,8,10,11};
        
//        int[] vector = new int[10];
//        
//        System.out.println("Introduce 10 elementos numericos");
//        
//        for (int i = 0; i < vector.length; i++) {
//            vector[i] = teclado.nextInt();
//        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i]%2 == 0) {
                if (i%2 == 0) {
                    System.out.println(vector[i]+" es par y esta en la posicion "+ i);
                }
            }
        }
    }
}
