package pilasarreglos;

public class PilasArreglos {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int opc;
        do{
            opc = metodos.menu();
            switch(opc){
                case 1 -> metodos.push();
                case 2 -> metodos.pop();
            
            }
        }while(opc != 0);
    }
}