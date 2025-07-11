package basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasedeDatos {

    public static void main(String[] args) {
        System.out.println("GESTION DE LA BASE DE DATOS CON SQLITE");
        
        String url = "jdbc:sqlite:userdb.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Conexión establecida a SQLite.");
                
                String sqlCrear = "CREATE TABLE IF NOT EXISTS usuarios (id INTEGER PRIMARY KEY, nombre TEXT, email TEXT)";
                Statement stmt = conn.createStatement();
                stmt.execute(sqlCrear);

                String sqlInsertar = "INSERT INTO usuarios(nombre, email) VALUES('Juan', 'juan@mail.com')";
                stmt.execute(sqlInsertar);
                
                String sqlSelect = "SELECT * FROM usuarios";
                ResultSet rs;
                rs = stmt.executeQuery(sqlSelect);

                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getString("email"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar con SQLite: " + e.getMessage());
        }
        
        System.out.println("--- FIN DEL PROGRAMA ---");
    }
}
