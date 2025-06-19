package numserie;

import java.util.Scanner;

public class NumSerie {
    public static void main(String[] args) {
        int cantidad = 10; 
 
        Metodos metodos = new Metodos(); 
        int[] serie = metodos.generarSerie(cantidad); 
 
        System.out.println("NUMERO DE SERIE FIBONACCI (primeros " + cantidad + " terminos):"); 
        for (int i = 0; i < serie.length; i++) { 
            System.out.println("Posición " + i + ": " + serie[i]); 
        } 
    } 
}