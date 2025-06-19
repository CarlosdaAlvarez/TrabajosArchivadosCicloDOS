package proyect001;

public class Administrativo extends Persona{
    private Integer uniformes;

    public Administrativo(int uniformes, String nombre, String apellido, int deni) {
        super(nombre, apellido, deni);
        this.uniformes = uniformes;
    }

    public Integer getUniformes() {
        return uniformes;
    }

    public void setUniformes(Integer uniformes) {
        this.uniformes = uniformes;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "uniformes=" + uniformes +super.toString()+ '}';
    }
    
}