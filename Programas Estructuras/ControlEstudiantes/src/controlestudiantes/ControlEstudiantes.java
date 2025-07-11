package controlestudiantes;

import java.util.Scanner;

public class ControlEstudiantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        char sexo;
        int id;

        System.out.print("Ingrese la cantidad de estudiantes: ");
        cantidad = sc.nextInt();
        sc.nextLine();

        Alumno[] Aula = new Alumno[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nEstudiante #" + (i + 1));

            System.out.print("ID: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            do {
                System.out.print("Sexo (M/H): ");
                sexo = sc.next().charAt(0);
            } while (sexo != 'M' && sexo != 'm' && sexo != 'H' && sexo != 'h');


            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = sc.nextDouble();

            Aula[i] = new Alumno(id, nombre, sexo, nota1, nota2, nota3);
        }

        ArbolesBinarios arbolMujeres = new ArbolesBinarios();
        ArbolesBinarios arbolHombres = new ArbolesBinarios();

        for (Alumno alumno : Aula) {
            double promedio = alumno.getPromedio();
            if (alumno.sexo == 'M' || alumno.sexo == 'm') {
                arbolHombres.insertar(alumno.id, alumno.nombre, promedio);
            } else if (alumno.sexo == 'H' || alumno.sexo == 'h') {
                arbolMujeres.insertar(alumno.id, alumno.nombre, promedio);
            }
        }


        mostrarReporte("MUJERES", arbolMujeres);
        mostrarReporte("HOMBRES", arbolHombres);
    }

    public static void mostrarReporte(String titulo, ArbolesBinarios arbol) {
        System.out.println("\n===== " + titulo + " =====");
        arbol.mostrarAprobados();
        arbol.mostrarReprobados();
    }
}

