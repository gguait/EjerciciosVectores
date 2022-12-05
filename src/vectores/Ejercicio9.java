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
public class Ejercicio9 {
    public static void main(String[] args) {
//        Escribe un programa que permita introducir un vector de veinte
//        elementos y visualizar el vector completo indicando posición y
//        contenido del elemento mayor. En caso de repetición prevalece el
//        primero.
        
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

        for(int i = 0; i < vector.length; i++) {  
            for(int j = i + 1; j < vector.length; j++) {  
                if(vector[i] == vector[j]){
                    System.out.println(vector[j]);
                } 
            }
        }  
    }
}
