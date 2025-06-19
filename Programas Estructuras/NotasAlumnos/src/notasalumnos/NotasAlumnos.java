package notasalumnos;

import java.util.Scanner;

public class NotasAlumnos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Ingrese el número de alumnos: "); 
        int alumnos = sc.nextInt(); 
 
        System.out.print("Ingrese el número de cursos: "); 
        int cursos = sc.nextInt(); 
 
        Metodos metodos = new Metodos(alumnos, cursos); 
        metodos.mostrarMatriz(); 
 
        sc.close(); 
    } 
}
