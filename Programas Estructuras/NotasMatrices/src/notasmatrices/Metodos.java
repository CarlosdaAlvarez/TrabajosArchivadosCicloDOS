package notasmatrices;

import java.util.Random;

public class Metodos {
    private int[][] notas;
    private int alumnos;
    private int cursos;
    private String[] nombresAlumnos;
    private String[] nombresCursos;

    public Metodos(int alumnos, int cursos, String[] nombresAlumnos, String[] nombresCursos) {
        this.alumnos = alumnos;
        this.cursos = cursos;
        this.nombresAlumnos = nombresAlumnos;
        this.nombresCursos = nombresCursos;
        this.notas = new int[alumnos][cursos];
        cargarNotasAleatorias();
    }

    private void cargarNotasAleatorias() {
        Random rand = new Random();
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < cursos; j++) {
                notas[i][j] = rand.nextInt(11); // Notas del 0 al 10
            }
        }
    }

    public void mostrarMatriz() {
        System.out.println("Matriz de Notas:");
        System.out.print("        ");
        for (String curso : nombresCursos) {
            System.out.printf("%10s", curso);
        }
        System.out.println();

        for (int i = 0; i < alumnos; i++) {
            System.out.printf("%-8s", nombresAlumnos[i]);
            for (int j = 0; j < cursos; j++) {
                System.out.printf("%10d", notas[i][j]);
            }
            System.out.println();
        }
    }

    public void mostrarNotaAlumnoCurso(String alumno, String curso) {
        int posAlumno = -1, posCurso = -1;

        for (int i = 0; i < nombresAlumnos.length; i++) {
            if (nombresAlumnos[i].equalsIgnoreCase(alumno)) {
                posAlumno = i;
                break;
            }
        }

        for (int j = 0; j < nombresCursos.length; j++) {
            if (nombresCursos[j].equalsIgnoreCase(curso)) {
                posCurso = j;
                break;
            }
        }

        if (posAlumno != -1 && posCurso != -1) {
            int nota = notas[posAlumno][posCurso];
            System.out.println("\n" + nombresAlumnos[posAlumno] + " tiene " + nota + " en " + nombresCursos[posCurso]);
        } else {
            System.out.println("Alumno o curso no encontrado.");
        }
    }
}
