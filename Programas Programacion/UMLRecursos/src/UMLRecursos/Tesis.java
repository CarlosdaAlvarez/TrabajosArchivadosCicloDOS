package umlrecursos;

public class Tesis extends Recurso {
    private String universidad;
    private String fechaDisertacion;

    public Tesis(String autor, String titulo, String fechaPublicacion, String universidad, String fechaDisertacion) {
        super(autor, titulo, fechaPublicacion);
        this.universidad = universidad;
        this.fechaDisertacion = fechaDisertacion;
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Universidad: " + universidad);
        System.out.println("Fecha de disertación: " + fechaDisertacion);
    }
}

