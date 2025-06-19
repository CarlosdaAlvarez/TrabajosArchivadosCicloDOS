package notasalumnos;

import java.util.Random;

public class Metodos {
    private int[][] notas; 
    private int alumnos; 
    private int cursos; 
 
    public Metodos(int alumnos, int cursos) { 
        this.alumnos = alumnos; 
        this.cursos = cursos; 
        this.notas = new int[alumnos][cursos]; 
        cargarNotasAleatorias(); 
    } 
 
    private void cargarNotasAleatorias() { 
        Random rand = new Random(); 
        for (int i = 0; i < alumnos; i++) { 
            for (int j = 0; j < cursos; j++) { 
                notas[i][j] = rand.nextInt(11);  
            } 
        } 
    } 
 
    public void mostrarMatriz() { 
        System.out.println("Matriz de Notas (Cursos x Alumnos):"); 
 
         
        System.out.print("     "); 
        for (int j = 0; j < cursos; j++) { 
            System.out.printf("%3d", j); 
        } 
        System.out.println(); 
 
        for (int i = 0; i < alumnos; i++) { 
            System.out.printf("%3d |", i); 
            for (int j = 0; j < cursos; j++) { 
                System.out.printf("%3d", notas[i][j]); 
            } 
            System.out.println(); 
        } 
    } 
}
