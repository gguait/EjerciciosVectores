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
public class Ejercicio7 {
//        Escribe un programa que permita introducir un vector de 50 elementos
//        numéricos e indique luego cual es el primer elemento cuyo contenido
//        sea cero. Si no lo hubiera, debe indicarlo.
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int[] vector = {76,38,29,15,80,85,33,0,51,19,20,87,39,44,47,75,86,44,40,69,63,50,28,64,5,77,69,15,59,75,0,26,13,99,87,39,92,85,35,44,13,67,92,81,98,51,93,55,54,75};
        int contador = 0;
//        int[] vector = new int[50];
//        
//        System.out.println("Introduce 10 elementos numericos");
//        
//        for (int i = 0; i < vector.length; i++) {
//            vector[i] = teclado.nextInt();
//        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {
                System.out.println(i+" vale cero");
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay ningun cero");
        }
    }
}
