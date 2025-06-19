package colasarreglos;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    int[] cola;
    int tope;
//    int frente;
    
    public Metodos(){
        this.sc = new Scanner(System.in);
        this.cola = new int[10];
        this.tope = -1;
//        this.frente = -1;
    }    
    public int menu(){
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("[1] Operacion Push:");
        System.out.println("[2] Operacion Pop");
        System.out.println("[0] Salir");
        return sc.nextInt();
    }

    public boolean colaLlena(){
        return (tope == cola.length-1);
    }
    
    public int leerNumero(){
        System.out.print("Ingrese el numero : ");
        return sc.nextInt();
    }

    public void push(){
        if(!colaLlena()){
        tope++;
        cola[tope] = leerNumero();
        }else{
            System.out.println("Error Overflow...");    
        }
    }
    
    public boolean colaVacia(){
        return (tope == -1);
    }
    
    public void avanzar(){
        for(int i=0; i < tope; i++){
            cola[i] = cola[i+1];
        }
    }

    public void pop() {
        if(!colaVacia()){
            System.out.println(cola[0]);  
            avanzar();
            tope --;
        }else{
            System.out.println("Error cola Vacia...");    
        }
    }
}    