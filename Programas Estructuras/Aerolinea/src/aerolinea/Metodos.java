package aerolinea;

public class Metodos {
    private final boolean[][] asientos; 
    private final int filas; 
    private final int columnas; 
 
    public Metodos(int filas, int columnas) { 
        this.filas = filas; 
        this.columnas = columnas; 
        this.asientos = new boolean[filas][columnas]; 
    } 
 
    public void mostrarAsientos() { 
        System.out.println("\nESTADO DE LOS ASIENTOS (O: Ocupado, V: Vacío):"); 
        for (int i = 0; i < filas; i++) { 
            System.out.print("Fila " + (i + 1) + ": "); 
            for (int j = 0; j < columnas; j++) { 
                System.out.print(asientos[i][j] ? "[O] " : "[V] "); 
            } 
            System.out.println(); 
        } 
    } 
 
    public void ocuparAsiento(int fila, int columna) { 
        if (asientos[fila][columna]) { 
            System.out.println("Ese asiento ya está ocupado."); 
        } else { 
            asientos[fila][columna] = true; 
            System.out.println("Asiento ocupado correctamente."); 
        } 
    } 
 
    public void liberarAsiento(int fila, int columna) { 
        if (!asientos[fila][columna]) { 
            System.out.println("Ese asiento ya estaba libre."); 
        } else { 
            asientos[fila][columna] = false; 
            System.out.println("Asiento liberado correctamente."); 
        } 
    } 
}
