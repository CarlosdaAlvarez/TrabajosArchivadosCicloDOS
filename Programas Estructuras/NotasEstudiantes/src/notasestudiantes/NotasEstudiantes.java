package notasestudiantes;

public class NotasEstudiantes {

    public static void main(String[] args) {
        Metodos metodos = new Metodos(); 
 
        metodos.mostrarNotas(); 
 
        System.out.println("\nPromedio por alumno:"); 
        double[] promedioAlumno = metodos.calcularMediaPorAlumno(); 
        for (int i = 0; i < promedioAlumno.length; i++) { 
            System.out.printf("Alumno %d: %.2f%n", (i + 1), promedioAlumno[i]); 
        } 
 
        System.out.println("\nPromedio por asignatura:"); 
        double[] promedioAsignatura = metodos.calcularMediaPorAsignatura(); 
        for (int i = 0; i < promedioAsignatura.length; i++) { 
            System.out.printf("Asignatura %d: %.2f%n", (i + 1), promedioAsignatura[i]); 
        } 
 
        System.out.printf("\nPromedio general de la clase: %.2f%n", 
        metodos.calcularMediaTotal()); 
    } 
}

