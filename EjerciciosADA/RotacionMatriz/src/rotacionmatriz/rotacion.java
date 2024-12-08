/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotacionmatriz;

import java.util.Random;
import java.util.Scanner;

public class rotacion {
    
    public static void mostrarMatriz(int dimension, int[][] matriz){
        
        for (int i = 0; i < dimension; i++) {
            System.out.print("\n[ ");
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("]");
        }
    }
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz: ");
        int dimension = leer.nextInt();

        int[][] matriz = new int[dimension][dimension];
        Random random = new Random();
        
        System.out.println("---Matriz Inicial---");
        
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        
        mostrarMatriz(dimension, matriz);
        System.out.println("");
        
        System.out.println("---Matriz rotada---");
        
        int[][] matrizRotada = new int[dimension][dimension];
        
        for(int i=0; i<dimension; i++){
            for(int j=0; j<dimension; j++){
                matrizRotada[j][dimension-i-1] = matriz[i][j];
            }
        }
        
        mostrarMatriz(dimension, matrizRotada);
        System.out.println("");
    }
    
}
