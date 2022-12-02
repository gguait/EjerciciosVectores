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
public class Vectores3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String[] elementos = new String[20];
        
        System.out.println("Introduce 20 elementos:");
        
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = teclado.nextLine();
        }
        
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i]+" ");
            if (i==3 || i==7 || i==11 || i==15) {
                System.out.println("\n");
            }
        }
        
    }
}
