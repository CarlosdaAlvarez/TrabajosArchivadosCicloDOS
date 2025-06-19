package proyect001;

import java.util.ArrayList;
import java.util.List;

public class Proyect001 {

    public static void main(String[] args) {
        System.out.println("Ejemplo de polimorfismo");

        Persona estudiante1 = new Estudiante(12,"David", "Merino", 18);
        Persona estudiante2 = new Estudiante(13,"Andres", "Jimenez", 20);

        Persona docente1 = new Docente(22,"Daniel", "Irene", 38);
        Persona docente2 = new Docente(23,"Ruth", "Reategui", 52);
        
        Persona administractivo1 = new Administrativo(2, "Carlos", "Alvarez", 20);
        Persona administractivo2 = new Administrativo(2, "Daniela", "Rincones", 18);
        
        List<Persona> lista = new ArrayList<>();
        lista.add(estudiante1);
        lista.add(estudiante2);
        lista.add(docente1);
        lista.add(docente2);
        lista.add(administractivo1);
        lista.add(administractivo2);

        ((Docente)docente2).setHorasClase(10);

        for (Persona p : lista) {
            System.out.println(p.toString());
        }
    }
}