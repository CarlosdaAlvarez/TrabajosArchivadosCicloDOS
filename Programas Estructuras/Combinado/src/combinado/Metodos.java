package combinado;

import java.util.Scanner;

public class Metodos {
    Scanner sc;
    Alumno[] aula;
    int ev;
    Nodo head;
    Nodo tail;
    
    public Metodos(int lim){
        this.sc = new Scanner(System.in);
        this.aula = new Alumno[lim];
        this.ev = 0;
        this.head = null;
        this.tail = null;
    }
    
    public int Menu(){
        System.out.println("\n[1] Insertar en Arreglo");
        System.out.println("[2] Recorrer el Arreglo");
        System.out.println("[3] Generar Lista");
        System.out.println("[4] Reporte chicas que Aprueban");
        System.out.println("[5] Reporte Chicos que Aprueban");
        System.out.println("[0] Salir");
        System.out.print("Ingrese su Eleccion: ");
        return sc.nextInt();
    }
    
    public Alumno leerDatos(){
        int Id;
        String nombre;
        char sexo;
        float[] notas = new float[3];
        System.out.print("Ingrese el ID: ");
        Id = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el Sexo: ");
        sexo = sc.next().charAt(0);
        System.out.print("Ingrese la Primera Calificacion: ");
        notas[0] = sc.nextFloat();
        System.out.print("Ingrese la Segunda Calificacion: ");
        notas[1] = sc.nextFloat();
        System.out.print("Ingrese la Tercera Caliicacion: ");
        notas[2] = sc.nextFloat();
        
        Alumno nuevo = new Alumno(Id, nombre, sexo, notas);
        return nuevo;
    }
    
    public void insertarArreglo(){
        if(ev < aula.length){
            aula[ev] = leerDatos();
            ev ++;
        }else{
            System.out.println("Aula Llena...");
        }
    }
    
    public void recorrerArreglo(){
        for (int i = 0; i < ev; i++) {
            System.out.println("Id: " + aula[i].Id + "Nombre: " + aula[i].nombre);
        }
    }
    
    public boolean nodoVacio(Nodo actual){
        return actual == null;
    }
    
    public void insertar(int Id,String nombre,char sexo,float promedio){
        Nodo nuevo = new Nodo(Id,nombre,sexo,promedio);
        if(nodoVacio(head)){
            head = nuevo;
            tail = nuevo;
        }
    }
    
    public void generarLista(){
        if(ev != 0){
            for (int i = 0; i < ev; i++) {
                insertar(aula[i].Id, aula[i].nombre, aula[i].sexo, aula[i].getPromedio());
            }
        }else{
            System.out.println("No Hay Datos...");
        }
    }
    
    public void reporte(char sexo){
        if(!nodoVacio(head)){
            Nodo actual = head;
            while(!nodoVacio(actual)){
                if(actual.sexo == sexo) && (actual.promedio >= 7)){
                    System.out.println("Nombre: "+ actual.nombre +" APROBADO/A con "+ actual.promedio);
                }   
            }    
        }else
            System.out.println("No Hay Datos...");
    }
}