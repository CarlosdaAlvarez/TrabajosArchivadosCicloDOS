package numprimo;

import java.util.Scanner;

public class NumPrimo {

    public static void main(String[] args) {
        int cantidad = 10; 
 
        Metodos metodos = new Metodos(); 
        int[] arreglo = metodos.generarPrimos(cantidad); 
 
    
        System.out.println("REPORTE NÚMEROS PRIMOS:"); 
        for (int i = 0; i < arreglo.length; i++) { 
            System.out.println("Posición " + i + ": " + arreglo[i]); 
        } 
    } 
}