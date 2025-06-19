package factorial;

import java.util.Scanner;

public class Metodos {
    public int factorial(int n) { 
        if (n == 0 || n == 1) 
            return 1; 
        else 
            return n * factorial(n - 1); 
    } 
 
    public int[] calcularFactoriales(int[] arregloA) { 
        int[] arregloB = new int[arregloA.length]; 
        for (int i = 0; i < arregloA.length; i++) { 
            arregloB[i] = factorial(arregloA[i]); 
        } 
        return arregloB; 
    } 
}