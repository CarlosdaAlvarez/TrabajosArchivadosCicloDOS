package umlrecursos;

public class UMLRecursos {

    public static void main(String[] args) {
        Recurso libro = new Libro("Gabriel García Márquez", "Cien años de soledad", "1967", "978-0307474728", 5);
        Recurso revista = new Revista("Varios", "National Geographic", "2021", 305, "https://natgeo.com");
        Recurso tesis = new Tesis("Juan Pérez", "Análisis de algoritmos", "2020", "UTPL", "2020-12-15");

        System.out.println("=== Libro ===");
        libro.mostrarFicha();
        System.out.println("\n=== Revista ===");
        revista.mostrarFicha();
        System.out.println("\n=== Tesis ===");
        tesis.mostrarFicha();
    }
}
