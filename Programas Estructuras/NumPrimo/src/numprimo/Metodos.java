package numprimo;
import java.util.Scanner;
import java.util.Arrays;

public class Metodos {
    private boolean esPrimo(int n) { 
        if (n < 2) return false; 
        for (int i = 2; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) return false; 
        } 
        return true; 
    } 
 
     
    public int[] generarPrimos(int cantidad) { 
        int[] primos = new int[cantidad]; 
        int numero = 1; 
        int contador = 0; 
 
        while (contador < cantidad) { 
            if (esPrimo(numero)) { 
                primos[contador] = numero; 
                contador++; 
            } 
            numero++; 
        } 
 
        return primos; 
    } 
}