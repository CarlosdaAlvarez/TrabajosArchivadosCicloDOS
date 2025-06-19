package gimnasio;
import java.util.ArrayList;
import java.util.Random;

public class Metodos {
    private final String[] clientes = { 
        "Ricardo", "Sofia", "Felipe", "Laura", "Mateo", 
        "Diana", "Arturo", "Daniela", "Jose", "Valeria" 
    }; 
 
    private final boolean[][] asistencia = new boolean[clientes.length][6]; 
 
    private final ArrayList<String> clientesConDescuento = new ArrayList<>(); 
 
    public void generarAsistenciaAleatoria() { 
        Random rand = new Random(); 
        for (int i = 0; i < clientes.length; i++) { 
            for (int j = 0; j < 6; j++) { 
                asistencia[i][j] = rand.nextBoolean();   
            } 
        } 
    } 
 
    public void calcularClientesConDescuento() { 
        for (int i = 0; i < clientes.length; i++) { 
            int conteo = 0; 
            for (int j = 0; j < 6; j++) { 
                if (asistencia[i][j]) { 
                    conteo++; 
                } 
            } 
            if (conteo >= 3) { 
                clientesConDescuento.add(clientes[i]); 
            } 
        } 
    } 
 
    public void mostrarAsistencia() { 
        String[] dias = {"  Lunes ", " Martes "," Miércoles ", " Jueves ", " Viernes ", " Sábado "}; 
        System.out.println("REGISTRO DE ASISTENCIA:"); 
        System.out.printf("%-10s", "Cliente"); 
        for (String dia : dias) { 
            System.out.printf("%-6s", dia); 
        } 
        System.out.println(); 
 
        for (int i = 0; i < clientes.length; i++) { 
            System.out.printf("%-10s", clientes[i]); 
            for (int j = 0; j < 6; j++) { 
                System.out.printf("%-6s", asistencia[i][j] ? "     ✓   " : "    ×   "); 
            } 
            System.out.println(); 
        } 
    } 
 
    public void mostrarClientesConDescuento() { 
        System.out.println("\nCLIENTES CON 20% DE DESCUENTO:"); 
        for (String cliente : clientesConDescuento) { 
            System.out.println("- " + cliente); 
        } 
    } 
} 
