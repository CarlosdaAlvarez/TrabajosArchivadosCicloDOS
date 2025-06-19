package pilasarreglos;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    int[] pila;
    int tope;
    
    public Metodos(){
        this.sc = new Scanner(System.in);
        this.pila = new int[10];
        this.tope = -1;
    }    
    public int menu(){
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("[1] Operacion Push:");
        System.out.println("[2] Operacion Pop");
        System.out.println("[0] Salir");
        return sc.nextInt();
    }
    
    public boolean pilaLlena(){
        return (tope == pila.length-1);
    }
    
    public int leerNumero(){
        System.out.print("Ingrese el numero : ");
        return sc.nextInt();
    }

    public void push(){
        if(!pilaLlena()){
        tope++;
        pila[tope] = leerNumero();
        }else{
            System.out.println("Error Overflow...");    
        }
    }
    
    public boolean pilaVacia(){
        return (tope == -1);
    }

    public void pop() {
        if(!pilaVacia()){
            System.out.println(pila[tope]);  
            tope --;
        }else{
            System.out.println("Error Pila Vacia...");    
        }
    }
}    
