package proyect001;

public class Docente extends Persona {
    private Integer horasClase;  

    public Docente(Integer horasClase, String nombre, String apellido, Integer dni) {
        super(nombre, apellido, dni);
        this.horasClase = horasClase;
    }

    public Integer getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(Integer horasClase) {
        this.horasClase = horasClase;
    }

    @Override
    public String toString() {
        return "Docente{" + "horasClase=" + horasClase + super.toString()+ '}';
    }                                                   
  
}