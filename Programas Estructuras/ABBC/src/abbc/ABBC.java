package abbc;

public class ABBC {

    public static void main(String[] args) {
        int opc;
        Metodos metodos = new Metodos();
        do {
            opc = metodos.menu();
            switch(opc){
                case 1 -> actualizarEstadoClientes();
                case 2 -> factorialRecursivo();
                  
            }
        }while (opc != 0);
    }
}    

