package libretas;

import java.util.Scanner;

public class Libretas {

    public static void main(String[] args) {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese cuántas notas desea ingresar: ");
        int numeroNotas = scanner.nextInt();

        double[] notas = new double[numeroNotas];
        double suma = 0;

        for (int i = 0; i < numeroNotas; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / numeroNotas;

        String cualitativo;

        if (promedio >= 0 && promedio <= 3.09) {
            cualitativo = "Regular";
        } else if (promedio <= 5.09) {
            cualitativo = "Insuficiente";
        } else if (promedio <= 7.09) {
            cualitativo = "Bueno";
        } else if (promedio <= 9.09) {
            cualitativo = "Muy bueno";
        } else {
            cualitativo = "Sobresaliente";
        }

        System.out.println("\n----- Resultados -----");
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.print("Calificaciones obtenidas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]);
            if (i < notas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.printf("Promedio: %.2f\n", promedio);
        System.out.println("Evaluación cualitativa: " + cualitativo);

        scanner.close();
    }
    
}
