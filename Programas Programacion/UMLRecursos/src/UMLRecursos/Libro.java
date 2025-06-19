package umlrecursos;

public class Libro extends Recurso {
    private String isbn;
    private int numeroImpresiones;

    public Libro(String autor, String titulo, String fechaPublicacion, String isbn, int numeroImpresiones) {
        super(autor, titulo, fechaPublicacion);
        this.isbn = isbn;
        this.numeroImpresiones = numeroImpresiones;
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de impresiones: " + numeroImpresiones);
    }
}


