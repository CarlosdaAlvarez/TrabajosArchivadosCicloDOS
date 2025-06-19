package arreglos.unidimensionales;

public class ArreglosUnidimensionales {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int opc;
        do{
            opc = metodos.Menu();
            switch(opc){
                case 1 -> metodos.LeerCompleto();
                case 2 -> metodos.Presentar();
                case 3 -> metodos.Buscar();
                case 4 -> metodos.InsInicio();
                case 5 -> metodos.InsOrden();
                case 6 -> metodos.Eliminar();
                case 7 -> metodos.Burbuja();
                case 8 -> metodos.BuscarNumero();
            
            }
        }while(opc != 0);
        
    }
    
}
