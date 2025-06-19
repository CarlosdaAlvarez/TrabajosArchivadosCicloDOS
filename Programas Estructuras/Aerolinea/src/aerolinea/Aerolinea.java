package aerolinea;

import java.util.Scanner;

public class Aerolinea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Metodos avion = new Metodos(5, 4);
 
        int opcion; 
 
        do { 
            System.out.println("\n--- SISTEMA DE ASIENTOS ---"); 
            System.out.println("1. Ver asientos"); 
            System.out.println("2. Ocupar asiento"); 
            System.out.println("3. Liberar asiento"); 
            System.out.println("4. Salir"); 
            System.out.print("Seleccione una opción: "); 
            opcion = sc.nextInt(); 
 
            switch (opcion) { 
                case 1: 
                    avion.mostrarAsientos(); 
                    break; 
                case 2: 
                    System.out.print("Ingrese fila (1 a 5): "); 
                    int filaOcupar = sc.nextInt() - 1; 
                    System.out.print("Ingrese columna (1 a 4): "); 
                    int colOcupar = sc.nextInt() - 1; 
                    avion.ocuparAsiento(filaOcupar, colOcupar); 
                    break; 
                case 3: 
                    System.out.print("Ingrese fila (1 a 5): "); 
                    int filaLiberar = sc.nextInt() - 1; 
                    System.out.print("Ingrese columna (1 a 4): "); 
                    int colLiberar = sc.nextInt() - 1; 
                    avion.liberarAsiento(filaLiberar, colLiberar); 
                    break; 
                case 4: 
                    System.out.println("Saliendo del sistema."); 
                    break; 
                default: 
                    System.out.println("Opción inválida."); 
            } 
 
        } while (opcion != 4); 
 
        sc.close(); 
    } 
}
