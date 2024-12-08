
package sumadiagonal;

import java.util.Random;
import java.util.Scanner;

public class SumaDiagonal {
    
    public static void mostrarMatriz(int dimension, int[][] matriz){
        for (int i = 0; i < dimension; i++) {
            System.out.print("\n[ ");
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("]");
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz: ");
        int dimension = leer.nextInt();

        int[][] matriz = new int[dimension][dimension];
        Random random = new Random();

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        
        int sumaDP = 0, sumaDS = 0;
        
        for(int i=0; i<dimension; i++){ 
            sumaDP = sumaDP + matriz[i][i]; //Suma diagonal principal
            sumaDS = sumaDS + matriz[i][dimension-i-1]; //Suma diagonal secundaria
        }
        
        System.out.println("Suma de la diagonal principal: " + sumaDP);
        System.out.println("Suma de la diagonal secundaria: " + sumaDS);
        
        mostrarMatriz(dimension, matriz);   
    }
}
