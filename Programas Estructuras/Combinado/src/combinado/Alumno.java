package combinado;

public class Alumno extends Persona{
    float[] notas;
    
    public Alumno(int Id, String nombre, char sexo, float[] notas){
        super(Id,nombre,sexo);
        this.notas = notas;
    }
    
    public float getPromedio(){
        float sum=0;
        for(float nota: notas)
            sum+=nota;
        return sum/3;
    }
}
