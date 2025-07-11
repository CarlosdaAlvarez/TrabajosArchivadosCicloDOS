package controlestudiantes;

public class Alumno {
    int id;
    String nombre;
    char sexo;
    double nota1, nota2, nota3;

    public Alumno(int id, String nombre, char sexo, double nota1, double nota2, double nota3) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return (nota1 + nota2 + nota3) / 3.0;
    }
}
