/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basedatospoo;


import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author PCENTER
 */
public class BaseDatosPoo {
    public static void main(String[] args) {
        System.out.println("Gestion de vehiculos");

        Scanner scanner = new Scanner(System.in);

        // Conexión a SQLite
        String url = "jdbc:sqlite:vehiculos.db";
        
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Hay coneccion con sql");

                // Crear tabla si no existe
                String sqlCrear = "CREATE TABLE IF NOT EXISTS vehiculos (" +
                                  "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                                  "tipo TEXT, marca TEXT, modelo TEXT)";
                Statement stmt = conn.createStatement();
                stmt.execute(sqlCrear);

                boolean continuar = true;

                while (continuar) {
                    System.out.print("Ingrese tipo de vehículo (Auto/Moto): ");
                    String tipo = scanner.nextLine();

                    System.out.print("Ingrese la marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Ingrese el modelo: ");
                    String modelo = scanner.nextLine();

                    Vehiculo vehiculo;

                    if (tipo.equalsIgnoreCase("Auto")) {
                        vehiculo = new Auto(marca, modelo);
                    } else if (tipo.equalsIgnoreCase("Moto")) {
                        vehiculo = new Moto(marca, modelo);
                    } else {
                        System.out.println("Tipo inválido. Intente otra vez.");
                        continue;
                    }

                    // Mostrar información 
                    vehiculo.mostrarInformacion();

                    // Insertar en la base de datos
                    String sqlInsertar = "INSERT INTO vehiculos (tipo, marca, modelo) VALUES (?, ?, ?)";
                    PreparedStatement pstmt = conn.prepareStatement(sqlInsertar);
                    pstmt.setString(1, vehiculo.getTipo());
                    pstmt.setString(2, vehiculo.marca);
                    pstmt.setString(3, vehiculo.modelo);
                    pstmt.executeUpdate();

                    System.out.print("¿Desea ingresar otro vehículo? (s/n): ");
                    String respuesta = scanner.nextLine();
                    if (respuesta.equalsIgnoreCase("n")) {
                        continuar = false;
                    }
                }

                // Mostrar registros en la base de datos
                System.out.println("\n--- Vehiculos ingresados ---");
                String sqlSelect = "SELECT * FROM vehiculos";
                ResultSet rs = stmt.executeQuery(sqlSelect);

                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " - " +
                                       rs.getString("tipo") + " - " +
                                       rs.getString("marca") + " - " +
                                       rs.getString("modelo"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error con SQLite: " + e.getMessage());
        }

        System.out.println("--- FIN DEL PROGRAMA ---");
    }
}