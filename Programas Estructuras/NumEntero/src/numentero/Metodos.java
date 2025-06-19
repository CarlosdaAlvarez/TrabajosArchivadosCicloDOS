package numentero;

public class Metodos {
    public boolean estaOrdenadoAscendente(int[] arreglo) { 
        for (int i = 0; i < arreglo.length - 1; i++) { 
            if (arreglo[i] > arreglo[i + 1]) { 
                return false; 
            } 
        } 
        return true; 
    } 
}
