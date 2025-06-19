package remdimvehiculos;

import java.util.Scanner;

public class RemdimVehiculos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rendimiento[] rendimientos = new Rendimiento[4];

        for (int i = 0; i < rendimientos.length; i++) {
            System.out.println("\nIngrese los datos del vehículo #" + (i + 1));
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Placa: ");
            String placa = sc.nextLine();

            double[] tiempoalcanzado = new double[4];
            double[] metrosaceleracion = new double[4];
            double[] velocidadalcanzada = new double[4];

            System.out.println("Ingrese los 4 tiempos (segundos):");
            for (int j = 0; j < 4; j++) {
                System.out.print("Tiempo " + (j + 1) + ": ");
                tiempoalcanzado[j] = sc.nextDouble();
            }

            System.out.println("Ingrese los 4 metros recorridos:");
            for (int j = 0; j < 4; j++) {
                System.out.print("Metro " + (j + 1) + ": ");
                metrosaceleracion[j] = sc.nextDouble();
            }

            System.out.println("Ingrese las 4 velocidades alcanzadas (km/h):");
            for (int j = 0; j < 4; j++) {
                System.out.print("Velocidad " + (j + 1) + ": ");
                velocidadalcanzada[j] = sc.nextDouble();
            }

            rendimientos[i] = new Rendimiento(marca, modelo, placa, metrosaceleracion, velocidadalcanzada, tiempoalcanzado);
        }

        System.out.println("\n--- Información de los Vehículos ---");
        for (Rendimiento r : rendimientos) {
            r.mostrarInformacion();
            System.out.println("-----------------------------");
        }
        sc.close();
    }
}
