/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package espiralmatriz;

import java.util.Random;
import java.util.Scanner;

public class EspiralMatriz {
    
    public static void aspiralMatriz(int m, int n,int [][] matriz, int[] array, int index, int minHorizontal, int minVertical, int limite){
        int maxHorizontal = m;
        int maxVertical = n;
        
        for(int i=minHorizontal; i<maxHorizontal; i++){
            System.out.println(index + " -- " + matriz[minHorizontal][i]);
            array[index] = matriz[minHorizontal][i];
            index++;
        }
        
        for(int i=minVertical; i<maxVertical; i++){
            System.out.println(index + " -- " + matriz[i][maxHorizontal-1]);
            array[index] = matriz[i][maxHorizontal-1];
            index++;
        }
        
        for(int i=maxHorizontal-1; i>minHorizontal; i--){
            System.out.println(index + " -- " + matriz[maxVertical-1][i]);
            array[index] = matriz[maxVertical-1][i];
            index++;
        }
        
        for(int i=maxVertical-2; i>minVertical-1; i--){
            System.out.println(index + " -- " + matriz[i][minHorizontal]);
            array[index] = matriz[i][minHorizontal];
            index++;
        }
        
        System.out.println("Indice final: " + index);
        
        if(index!=limite){
            aspiralMatriz(m-1, n-1, matriz, array, index, minHorizontal+1, minVertical+1, limite);
        }
    }
    
    public static void mostrarMatriz(int[][] matriz, int filas, int columnas){
        for(int i=0; i<filas; i++){
            System.out.print("[ ");
            for(int j=0; j<columnas ; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("]");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las filas: ");
        int filas = leer.nextInt();
        System.out.println("Ingrese las columnas: ");
        int columnas = leer.nextInt();
        int[] array = new int[filas*columnas];
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        
        mostrarMatriz(matriz, filas, columnas);
        
        aspiralMatriz(columnas, filas, matriz, array, 0, 0, 1, columnas*filas);
        
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    
}
