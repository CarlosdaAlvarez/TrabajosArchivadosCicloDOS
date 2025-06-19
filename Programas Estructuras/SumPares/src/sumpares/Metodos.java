package sumpares;

public class Metodos {
    public static class Resultado { 
        public int sumaPares; 
        public int sumaImpares; 
 
        public Resultado(int sumaPares, int sumaImpares) { 
            this.sumaPares = sumaPares; 
            this.sumaImpares = sumaImpares; 
        } 
    } 
 
    public Resultado calcularSumas(int[] lista) { 
        int sumaPares = 0; 
        int sumaImpares = 0; 
 
        for (int num : lista) { 
            if (num % 2 == 0) 
                sumaPares += num; 
            else 
                sumaImpares += num; 
        } 
        return new Resultado(sumaPares, sumaImpares); 
    } 
}
