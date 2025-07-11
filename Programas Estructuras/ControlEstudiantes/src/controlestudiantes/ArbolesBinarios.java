package controlestudiantes;

public class ArbolesBinarios {
    Nodo raiz;

    public void insertar(int id, String nombre, double promedio) {
        raiz = insertarRecursivo(raiz, id, nombre, promedio);
    }

    public Nodo insertarRecursivo(Nodo actual, int id, String nombre, double promedio) {
        if (actual == null) {
            return new Nodo(id, nombre, promedio);
        }
        if (id < actual.id) {
            actual.izquierda = insertarRecursivo(actual.izquierda, id, nombre, promedio);
        } else if (id > actual.id) {
            actual.derecha = insertarRecursivo(actual.derecha, id, nombre, promedio);
        }
        return actual;
    }

    public void mostrarAprobados() {
        System.out.println("Estudiantes aprobados:");
        mostrarPorCondicion(raiz, true);
    }

    public void mostrarReprobados() {
        System.out.println("Estudiantes reprobados:");
        mostrarPorCondicion(raiz, false);
    }

    public void mostrarPorCondicion(Nodo nodo, boolean aprobado) {
        if (nodo != null) {
            mostrarPorCondicion(nodo.izquierda, aprobado);
            if ((aprobado && nodo.promedio >= 7) || (!aprobado && nodo.promedio < 7)) {
                System.out.printf("ID: %d, Nombre: %s, Promedio: %.2f\n", nodo.id, nodo.nombre, nodo.promedio);
            }
            mostrarPorCondicion(nodo.derecha, aprobado);
        }
    }
}
