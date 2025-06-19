package enlazadas;

public class Enlazadas {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int opc;
        do{
            opc = metodos.Menu();
            switch (opc){
                case 1 -> metodos.insertar();
                case 2 -> metodos.recorrer();
                case 3 -> metodos.();
                case 4 -> metodos.();
            }
        }while (opc != 0);
    } 
    
}
