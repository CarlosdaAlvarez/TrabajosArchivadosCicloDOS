package notasestudiantes;

import java.util.Random;

public class Metodos  { 
 
    private final int[][] notas; 
    private final int alumnos = 20; 
    private final int asignaturas = 4; 
 
    public Metodos() { 
        notas = new int[alumnos][asignaturas]; 
        llenarNotasAleatorias(); 
    } 
 
    private void llenarNotasAleatorias() { 
        Random rand = new Random(); 
        for (int i = 0; i < alumnos; i++) { 
            for (int j = 0; j < asignaturas; j++) { 
                notas[i][j] = rand.nextInt(11); // 0 a 10 
            } 
        } 
    } 
 
    public double[] calcularMediaPorAlumno() { 
        double[] promedios = new double[alumnos]; 
        for (int i = 0; i < alumnos; i++) { 
            int suma = 0; 
            for (int j = 0; j < asignaturas; j++) { 
                suma += notas[i][j]; 
            } 
            promedios[i] = suma / (double) asignaturas; 
        } 
        return promedios; 
    } 
 
    public double[] calcularMediaPorAsignatura() { 
        double[] promedios = new double[asignaturas]; 
        for (int j = 0; j < asignaturas; j++) { 
            int suma = 0; 
            for (int i = 0; i < alumnos; i++) { 
                suma += notas[i][j]; 
            } 
            promedios[j] = suma / (double) alumnos; 
        } 
        return promedios; 
    } 
 
    public double calcularMediaTotal() { 
        int sumaTotal = 0; 
        for (int i = 0; i < alumnos; i++) { 
            for (int j = 0; j < asignaturas; j++) { 
                sumaTotal += notas[i][j]; 
            } 
        } 
        return sumaTotal / (double) (alumnos * asignaturas); 
    } 
 
    public void mostrarNotas() { 
        System.out.println("Matriz de Notas:"); 
        for (int i = 0; i < alumnos; i++) { 
            System.out.print("Alumno " + (i + 1) + ": "); 
            for (int j = 0; j < asignaturas; j++) { 
                System.out.print(notas[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
} 
