package clientes;
import java.io.*;
import java.util.Scanner;

public class Clientes {

    public static void main(String[] args) {
        String inputFile = "Deudas.txt";
        String outputFile = "Liberados.txt";

        try (Scanner sc = new Scanner(new File(inputFile));
             PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                linea = linea.replace("Central de Riesgo", "Liberado");
                writer.println(linea);
            }
            System.out.println("Archivo actualizado creado como: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
