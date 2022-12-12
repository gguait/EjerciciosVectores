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
public class Ejercicio11 {
//        Escribe un programa que permita introducir un vector P de diez
//        elementos numéricos, visualizar su contenido, crear un vector V con
//        los elementos de P que sean mayores de diez. Visualizar luego el
//        contenido de V.

    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);

        int[] vectorP = {0, 1, 2, 3, 12, 5, 6, 142, 8, 9};
        int contadorMayoresDiez = 0;
//        int[] vectorP = new int[10];
//        
//        System.out.println("Introduce 10 elementos numericos");
//        
//        for (int i = 0; i < vectorP.length; i++) {
//            vectorP[i] = teclado.nextInt();
//        }
        System.out.println("Array: ");
        for (int i = 0; i < vectorP.length; i++) {
            if (vectorP[i] >= 10) {
                contadorMayoresDiez++;
            }
            System.out.print(vectorP[i]+" ");
        }
        System.out.println("\n");

        int[] vectorV = new int[contadorMayoresDiez];

        for (int i = 0; i < vectorP.length; i++) {
            if (vectorP[i] >= 10) {
                int j = 0;
                vectorV[j] = vectorP[i];
                j++;
            }
        }
        System.out.println("Elementos mayores de 10: ");
        for (int i = 0; i < vectorV.length; i++) {
            System.out.print(vectorV[i]+" ");
        }
        System.out.println("\n");
    }
}