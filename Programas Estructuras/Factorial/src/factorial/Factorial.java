package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int[] arregloA = new int[10]; 
 
        System.out.println("Ingrese 10 números enteros para calcular el factorial:"); 
        for (int i = 0; i < arregloA.length; i++) { 
            System.out.print("Número " + (i + 1) + ": "); 
            arregloA[i] = scanner.nextInt(); 
        } 
 
        Metodos metodos = new Metodos(); 
        int[] arregloB = metodos.calcularFactoriales(arregloA); 
 
        System.out.println("\nREPORTE DE FACTORIALES:"); 
        for (int i = 0; i < arregloA.length; i++) { 
            System.out.println(arregloA[i] + "! = " + arregloB[i]); 
        } 
    } 
} 

