package elementoinsert;

import java.util.ArrayList;

public class NumInmediato {

    public static void insertarDespues(ArrayList<Integer> lista, int numeroObjetivo, int nuevoElemento) {
        int index = lista.indexOf(numeroObjetivo);
        if (index != -1) {
            lista.add(index + 1, nuevoElemento);
        } else {
            System.out.println("El número " + numeroObjetivo + " no se encuentra en la lista.");
        }
    }
}