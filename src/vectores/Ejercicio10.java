/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores;

//import java.util.Scanner;

/**
 *
 * @author pabmar
 */
public class Ejercicio10 {
//        Escribe un programa que permita introducir un vector de veinte
//        elementos, visualizar e indicar luego si hay o no algún elemento
//        repetido. En ese caso indicar cuáles son y la posición que ocupan.
        public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
        
        
        int[] vector = {76,38,40,15,80,85,33,33,33,19,20,87,39,44,47,75,86,44,40,69};
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
                    System.out.println(vector[j]+ " esta repetido, posicion "+i+" y "+j);
                } 
            }
        }
    }
}
