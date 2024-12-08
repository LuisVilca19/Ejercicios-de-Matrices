package perimetromatriz;

import java.util.Random;
import java.util.Scanner;

public class PerimetroMatriz {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz: ");
        int dimension = leer.nextInt();
        int min = 0, max = dimension-min;

        int[][] matriz = new int[dimension][dimension];
        Random random = new Random();

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        
        int suma = 0;    
        for (int i = min; i < max; i++) {
            suma = suma + matriz[min][i];
        }
        for (int i = min + 1; i < max; i++) {
            suma = suma + matriz[i][max - 1];
        }
        for (int i = min; i < max - 1; i++) {
            suma = suma + matriz[max - 1][i];
        }
        for (int i = min + 1; i < max - 1; i++) {
            suma = suma + matriz[i][min];
        }
        
        System.out.println("La suma del perimetro es: " + suma);
    }
}