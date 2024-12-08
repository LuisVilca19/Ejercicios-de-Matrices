package transpuestamatriz;
import java.util.Random;
import java.util.Scanner;

public class TranspuestaMatriz {
    
    public static void mostrarMatriz(int filas, int columnas, int[][] matriz){
        for (int i = 0; i < filas; i++) {
            System.out.print("\n[ ");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("]");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese las filas: ");
        int filas = leer.nextInt();
        System.out.println("Ingrese las columnas: ");
        int columnas = leer.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        int[][] transpuesta = new int[columnas][filas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        
        System.out.println("Matriz:");
        mostrarMatriz(filas, columnas, matriz);
        System.out.println("Transpuesta:");
        mostrarMatriz(columnas, filas, transpuesta);
    }
}
