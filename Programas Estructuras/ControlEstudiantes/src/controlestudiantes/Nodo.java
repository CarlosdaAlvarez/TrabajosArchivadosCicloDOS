package controlestudiantes;

public class Nodo {
    int id;
    String nombre;
    double promedio;
    Nodo izquierda, derecha;

    public Nodo(int id, String nombre, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
        this.izquierda = null;
        this.derecha = null;
    }
}

