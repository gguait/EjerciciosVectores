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
public class Vectores5 {
//        Escribe un programa que permita leer una secuencia de 50 números,
//        guardarlos en un vector. Calcular e imprimir la suma de aquellos cuyo
//        contenido sea par. 
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int[] vector = {76,38,29,15,80,85,33,32,51,19,20,87,39,44,47,75,86,44,40,69,63,50,28,64,5,77,69,15,59,75,62,26,13,99,87,39,92,85,35,44,13,67,92,81,98,51,93,55,54,75};
        
        int sumapar=0;
//        int[] vector = new int[10];
//        
//        System.out.println("Introduce 10 elementos numericos");
//        
//        for (int i = 0; i < vector.length; i++) {
//            vector[i] = teclado.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i]%2 == 1) {
                sumapar += i;
            }
        }
        System.out.println(sumapar);

    }    
}
