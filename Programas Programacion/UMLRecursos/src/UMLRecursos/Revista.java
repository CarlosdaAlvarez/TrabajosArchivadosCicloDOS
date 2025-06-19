package umlrecursos;

public class Revista extends Recurso {
    private int numeroEdicion;
    private String urlRevista;

    public Revista(String autor, String titulo, String fechaPublicacion, int numeroEdicion, String urlRevista) {
        super(autor, titulo, fechaPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.urlRevista = urlRevista;
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Número de edición: " + numeroEdicion);
        System.out.println("URL de la revista: " + urlRevista);
    }
}
