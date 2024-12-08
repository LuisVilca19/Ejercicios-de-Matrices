package simetriamatriz;

import java.util.Random;
import java.util.Scanner;

public class SimetriaMatriz {
    
    public static void mostrarMatriz(int dimension, int[][] matriz){
        
        for (int i = 0; i < dimension; i++) {
            System.out.print("\n[ ");
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("]");
        }
    }

    public static int[][] crearMatriz (int dimension){
        Random random = new Random();
        int[][] matriz = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        return matriz;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz: ");
        int dimension = leer.nextInt();

        int[][] matriz = crearMatriz(dimension);
        
        System.out.println("---Matriz Inicial---");
        
        mostrarMatriz(dimension, matriz);
        boolean verificar = true;
        
        for(int i=0; i<dimension; i++){
            for(int j=i+1; j<dimension; j++){
                if(matriz[i][j] != matriz[j][i]){
                    verificar = false;
                    break;
                }
            }
        }
        
        String mensaje = verificar ? "SI es simétrica":"NO es simétrica";
        System.out.println(mensaje);   
    }
}
