package umlrecursos;

public class Recurso {
    protected String autor;
    protected String titulo;
    protected String fechaPublicacion;

    public Recurso(String autor, String titulo, String fechaPublicacion) {
        this.autor = autor;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

    public void mostrarFicha() {
        System.out.println("Autor: " + autor);
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de publicación: " + fechaPublicacion);
    }
}


