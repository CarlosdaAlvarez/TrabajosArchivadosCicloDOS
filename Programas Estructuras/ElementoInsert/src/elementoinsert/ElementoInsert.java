package elementoinsert;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementoInsert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Ingrese los números de la lista (escriba 'fin' para terminar):");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                int numero = Integer.parseInt(entrada);
                lista.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese un número o 'fin' para terminar.");
            }
        }

        System.out.print("Ingrese el número objetivo: ");
        int objetivo = scanner.nextInt();

        System.out.print("Ingrese el nuevo número a insertar: ");
        int nuevo = scanner.nextInt();

        NumInmediato.insertarDespues(lista, objetivo, nuevo);

        System.out.println("Lista final: " + lista);
    }
}


