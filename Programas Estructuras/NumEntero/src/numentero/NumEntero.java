package numentero;

public class NumEntero {

    public static void main(String[] args) {
        int[] arreglo = {2, 3, 5, 8, 10, 16, 19}; 
 
        Metodos metodos = new Metodos(); 
 
        if (metodos.estaOrdenadoAscendente(arreglo)) { 
            System.out.println("El arreglo está ordenado ascendentemente."); 
        } else { 
            System.out.println("El arreglo NO está ordenado ascendentemente."); 
        } 
    } 
}