package enlazadas;
import java.util.Scanner;

public class Metodos {
    Scanner sc;
    Nodo head;
    
    public Metodos(){
        this.sc = new Scanner(System.in);
        this.head = null;
    }
    
    public int Menu(){
        System.out.println("[1] Insertar: ");
        System.out.println("[2] Recorrer: ");
        System.out.println("[0] Salir");
        System.out.print("Ingrese su Eleccion: ");
        return sc.nextInt();
    }

    public int LeerDatos(){
        System.out.println("Ingrese valor a insertar: ");
        return sc.nextInt();
    }
    
    public boolean listaVacia(){
        return head == null;
    }
    
    public void insertar(){
        Nodo nuevo = new Nodo(LeerDatos());
        if(listaVacia()){
            head = nuevo;
        }else{
            Nodo actual = head;
            while(actual.siguiente != null){
                actual = actual.siguiente;
                actual.siguiente = nuevo;
            }
        } 
    }
    
    public void recorrer(){
        Nodo actual = head;
        while(actual != null){
        System.out.println(actual.valor + " - ");
        actual = actual.siguiente;
        }
    }
}
