package sumpares;

public class SumPares {

    public static void main(String[] args) {
        int[] lista = {2, 5, 6, 7, 10, 14, 15, 18}; 
 
        Metodos metodos = new Metodos(); 
        Metodos.Resultado resultado = metodos.calcularSumas(lista); 
 
        System.out.println("REPORTE DE SUMAS:"); 
        System.out.println("Suma de números pares: " + resultado.sumaPares); 
        System.out.println("Suma de números impares: " + resultado.sumaImpares); 
    } 
}
