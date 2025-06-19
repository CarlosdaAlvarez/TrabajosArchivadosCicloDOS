package numaleatorios;

import java.util.Scanner;

public class NumAleatorios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Ingrese el tamaño N de la matriz NxN: "); 
        int n = sc.nextInt(); 
 
        Metodos metodos = new Metodos(n);
 
        metodos.mostrarMatriz("Matriz Original"); 
        metodos.transponerDiagonalSecundaria(); 
        metodos.mostrarMatriz("Matriz Resultante (transpuesta sobre diagonal secundaria)"); 
 
        sc.close(); 
    } 
}