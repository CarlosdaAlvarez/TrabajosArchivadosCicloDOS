package enlazadas;
import java.util.Scanner;

public class Metodos {
    Scanner sc;
    Nodo head;
    Nodo tail;
    public Metodos(){
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    } 
    
    public int Menu(){
        System.out.println("\n[1] Insertar:");
        System.out.println("[2] Recorrer:");
        System.out.println("[0] Salir");
        System.out.print("Ingrese su Eleccion: ");
        return sc.nextInt();
    }
    
    public int leerDatos(){
        System.out.print("Ingrese el Valor a Insertar: ");
        return sc.nextInt();
    }
    
    public boolean listaVacia(){
        return head == null;
    }
    
    /* public void insertar(){
        Nodo nuevo = new Nodo(leerDatos());
        if(listaVacia()){
            head = nuevo;
        }else{
            Nodo actual = head;
            while(actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    /*/

    public void InsInicio(){
        Nodo nuevo = new Nodo(leerDatos());
        if(listaVacia()){
            head = nuevo;
        }else{
            nuevo.siguiente = head;
            head = nuevo;
        }
    }
    
    public void insertar(){
        Nodo nuevo = new Nodo(leerDatos());
        if(listaVacia()){
            head = nuevo;
            tail = nuevo;
        }else{
            tail.siguiente = nuevo;
            tail = nuevo;
        }
    }    
    
    public void InsOrden(){
        Nodo nuevo = new Nodo(leerDatos());
        if(listaVacia()){
            head = nuevo;
        }else if(nuevo.valor < head.valor) {
            nuevo.siguiente = head;
            head = nuevo;
        }
    }
    
    public void recorrer(){
        Nodo actual = head;
        while(actual != null){
            System.out.print(actual.valor + " - ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    
}