package notasmatrices;

import java.util.Scanner;

public class NotasMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombresAlumnos = {"Juan", "Lucía", "Vero", "Carlos"};
        String[] nombresCursos = {"    Cálculo"," Matemáticas","Historia","Ciencias","Lógica"};
        
        int alumnos = nombresAlumnos.length;
        int cursos = nombresCursos.length;

        Metodos metodos = new Metodos(alumnos, cursos, nombresAlumnos, nombresCursos);
        metodos.mostrarMatriz();

        System.out.print("\nIngrese el nombre del alumno: ");
        String alumno = sc.nextLine();

        System.out.print("Ingrese el nombre del curso: ");
        String curso = sc.nextLine();

        metodos.mostrarNotaAlumnoCurso(alumno, curso);

        sc.close();
    }
}
