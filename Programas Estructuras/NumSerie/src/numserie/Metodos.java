package numserie;

import java.util.Scanner;

public class Metodos {
    public int fibonacci(int n) { 
        if (n == 0 || n == 1) 
            return 1; 
        else 
            return fibonacci(n - 1) + fibonacci(n - 2); 
    } 
 
    public int[] generarSerie(int cantidad) { 
        int[] serie = new int[cantidad]; 
        for (int i = 0; i < cantidad; i++) { 
            serie[i] = fibonacci(i); 
        } 
        return serie; 
    } 
}