// =======================================
// Clase Nodo (para pilas y colas con listas)
// =======================================
class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

// =======================================
// Clase Pila con Lista Enlazada
// =======================================
class PilaLista<T> {
    private Nodo<T> cima;

    public void push(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public T pop() {
        if (cima == null) throw new RuntimeException("Pila vacía");
        T dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    public T peek() {
        if (cima == null) throw new RuntimeException("Pila vacía");
        return cima.dato;
    }
}

// =======================================
// Clase Cola con Lista Enlazada
// =======================================
class ColaLista<T> {
    private Nodo<T> frente, fin;

    public void enqueue(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (fin != null) fin.siguiente = nuevo;
        fin = nuevo;
        if (frente == null) frente = fin;
    }

    public T dequeue() {
        if (frente == null) throw new RuntimeException("Cola vacía");
        T dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        return dato;
    }

    public T peek() {
        if (frente == null) throw new RuntimeException("Cola vacía");
        return frente.dato;
    }
}

// =======================================
// Clase Pila con Arreglo
// =======================================
class PilaArreglo {
    private int[] arreglo;
    private int tope = -1;

    public PilaArreglo(int capacidad) {
        arreglo = new int[capacidad];
    }

    public void push(int dato) {
        if (tope + 1 == arreglo.length) throw new RuntimeException("Pila llena");
        arreglo[++tope] = dato;
    }

    public int pop() {
        if (tope == -1) throw new RuntimeException("Pila vacía");
        return arreglo[tope--];
    }

    public int peek() {
        if (tope == -1) throw new RuntimeException("Pila vacía");
        return arreglo[tope];
    }
}

// =======================================
// Clase Cola con Arreglo
// =======================================
class ColaArreglo {
    private int[] arreglo;
    private int frente = 0, fin = -1, tamaño = 0;

    public ColaArreglo(int capacidad) {
        arreglo = new int[capacidad];
    }

    public void enqueue(int dato) {
        if (tamaño == arreglo.length) throw new RuntimeException("Cola llena");
        fin = (fin + 1) % arreglo.length;
        arreglo[fin] = dato;
        tamaño++;
    }

    public int dequeue() {
        if (tamaño == 0) throw new RuntimeException("Cola vacía");
        int dato = arreglo[frente];
        frente = (frente + 1) % arreglo.length;
        tamaño--;
        return dato;
    }

    public int peek() {
        if (tamaño == 0) throw new RuntimeException("Cola vacía");
        return arreglo[frente];
    }
}

// =======================================
// Clase Principal para probar todas las clases
// =======================================
public class Main {
    public static void main(String[] args) {
        // Pila con lista enlazada
        PilaLista<Integer> pilaLista = new PilaLista<>();
        pilaLista.push(10);
        pilaLista.push(20);
        System.out.println("Pila (Lista) tope: " + pilaLista.peek());
        pilaLista.pop();
        System.out.println("Pila (Lista) nuevo tope: " + pilaLista.peek());

        // Cola con lista enlazada
        ColaLista<String> colaLista = new ColaLista<>();
        colaLista.enqueue("A");
        colaLista.enqueue("B");
        System.out.println("Cola (Lista) frente: " + colaLista.peek());
        colaLista.dequeue();
        System.out.println("Cola (Lista) nuevo frente: " + colaLista.peek());

        // Pila con arreglo
        PilaArreglo pilaArr = new PilaArreglo(3);
        pilaArr.push(100);
        pilaArr.push(200);
        System.out.println("Pila (Arreglo) tope: " + pilaArr.peek());
        pilaArr.pop();
        System.out.println("Pila (Arreglo) nuevo tope: " + pilaArr.peek());

        // Cola con arreglo
        ColaArreglo colaArr = new ColaArreglo(3);
        colaArr.enqueue(1);
        colaArr.enqueue(2);
        System.out.println("Cola (Arreglo) frente: " + colaArr.peek());
        colaArr.dequeue();
        System.out.println("Cola (Arreglo) nuevo frente: " + colaArr.peek());
    }
}
