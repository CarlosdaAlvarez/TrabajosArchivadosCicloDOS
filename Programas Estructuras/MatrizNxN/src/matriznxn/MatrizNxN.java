package matriznxn;

public class MatrizNxN {

    public static void main(String[] args) {
        int opc;
        Metodos metodos = new Metodos();

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 -> metodos.generarMatrizOrden();
            }
        } while (opc != 0);
    }
}