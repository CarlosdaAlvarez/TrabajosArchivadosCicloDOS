package numaleatorios;

import java.util.Random;

public class Metodos {
    private int[][] matriz; 
    private int n; 
 
    public Metodos(int n) { 
        this.n = n; 
        this.matriz = new int[n][n]; 
        llenarMatriz(); 
    } 
 
    private void llenarMatriz() { 
        Random rand = new Random(); 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                matriz[i][j] = rand.nextInt(99) + 1; 
            } 
        } 
    } 
 
    public void mostrarMatriz(String titulo) { 
        System.out.println("\n" + titulo + ":"); 
        for (int[] fila : matriz) { 
            for (int valor : fila) { 
                System.out.printf("%4d", valor); 
            } 
            System.out.println(); 
        } 
    } 
 
    public void transponerDiagonalSecundaria() { 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n - i - 1; j++) { 
                int temp = matriz[i][j]; 
                matriz[i][j] = matriz[n - j - 1][n - i - 1]; 
                matriz[n - j - 1][n - i - 1] = temp; 
            } 
        } 
    } 
} 
