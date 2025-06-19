package combinado;

public class Combinado {

    public static void main(String[] args) {
        Metodos metodos = new Metodos(10);
        int opc;
        do{
            opc = metodos.Menu();
            switch (opc){
                case 1 -> metodos.insertarArreglo();
                case 2 -> metodos.recorrerArreglo();
                case 3 -> metodos.generarLista();
                case 4 -> metodos.reporte('m');
                case 5 -> metodos.reporte('h');
            }
        }while (opc != 0);
    } 
    
}
