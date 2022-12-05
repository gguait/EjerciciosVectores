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
public class Ejercicio8 {
//        Escribe un programa que permita introducir vector de veinte elementos
//        y visualizar, indicar luego posición y contenido de todos aquellos que
//        sean mayores que diez. Indicando cuantos elementos hay que
//        cumplen esta condición
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int[] vector = {76,38,29,15,80,85,33,0,51,19,20,87,39,44,47,75,86,44,40,69};
        int contador = 0;
//        int[] vector = new int[20];
//        
//        System.out.println("Introduce 20 elementos numericos");
//        
//        for (int i = 0; i < vector.length; i++) {
//            vector[i] = teclado.nextInt();
//        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= 10) {
                System.out.println("El numero en posicion "+i+" es "+vector[i]);
                contador++;
            }
        }
        System.out.println(contador+" numeros son mayores a 10");
    }
}
