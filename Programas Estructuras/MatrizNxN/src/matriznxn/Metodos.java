package matriznxn;

import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("\n+----------------------------+");
        System.out.println("|       MENU PRINCIPAL       |");
        System.out.println("+----------------------------+");
        System.out.println("[1] Generar Matriz de Orden");
        System.out.println("[0] Salir");
        System.out.print("Ingrese su opcion: ");
        return sc.nextInt();
    }

    public void generarMatrizOrden() {
        int N;
        do {
            System.out.print("Ingrese un valor impar y mayor que 3 para N: ");
            N = sc.nextInt();
            if (N % 2 == 0 || N <= 3) {
                System.out.println("¡Error! N debe ser impar y mayor que 3.");
            }
        } while (N % 2 == 0 || N <= 3);

        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        mostrarMatriz(matriz);
    }

    public void mostrarMatriz(int[][] X) {
        System.out.println("\nMATRIZ GENERADA:");
        for (int[] fila : X) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
