package vectores;

import java.util.Scanner;

/**
 *
 * @author pabmar
 */
public class Vectores4 {
//        Escribe un programa que permita introducir vector numérico de diez
//        elementos, visualizarlo y luego visualizar los elementos cuyo contenido
//        sea par, indicando su posición.
//        Repetir para impar.
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int[] vector = {1,2,3,4,5,6,7,8,9,11};
        
//        int[] vector = new int[10];
//        
//        System.out.println("Introduce 10 elementos numericos");
//        
//        for (int i = 0; i < vector.length; i++) {
//            vector[i] = teclado.nextInt();
//        }
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]%2 == 0) {
                System.out.println(vector[i]+" es par y esta en la posicion "+ i);
            }
        }
    }
}
