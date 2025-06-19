package gimnasio;

public class Gimnasio {

    public static void main(String[] args) {
        Metodos metodos = new Metodos(); 
 
        metodos.generarAsistenciaAleatoria(); 
        metodos.mostrarAsistencia(); 
 
        metodos.calcularClientesConDescuento(); 
        metodos.mostrarClientesConDescuento(); 
    } 
}

