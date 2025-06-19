package matrices;

public class Matrices {

    public static void main(String[] args) {
        int opc;
        Metodos metodos = new Metodos();
        
        do{
            opc = metodos.menu();
            switch(opc){
                //case 1 -> metodos.ingresoDatos();
                //case 2 -> metodos.mostrarMatriz();
                case 3 -> metodos.transpuesta();
                case 4 -> metodos.transpuesta2();
                case 5-> metodos.multiplicarMatrices();
            }
        }while(opc != 0);

    }
    
}


package matrices;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    int[][] X = new int[4][4];
    int[][] A = new int [3][4];
    int[][] B = new int[4][2];
    int[][] R = new int[3][2];
    
    public int menu(){
        System.out.println("\n+----------------+");
        System.out.println("| MENU PRINCIPAL |");
        System.out.println("+----------------+");
        System.out.println("[1] Ingresar Datos a Matriz");
        System.out.println("[2] Mostrar Matriz");
        System.out.println("[3] Transpuesta de la Matriz");
        System.out.println("[4] Transpuesta de la Matriz Inversa");
        System.out.println("[5] Multiplicar Matriz");
        System.out.println("[0] Salir");
        System.out.print("Ingrese su Eleccion: ");
        return sc.nextInt();
    }
    
    public void ingresoDatos(int[][] X){
        System.out.println("\nMATRIZ X");
        for(byte i = 0; i < X.length; i ++){
            for(byte j = 0; j < X[i].length; j ++){
                System.out.print("Posicion [" + (i + 1) + "," + (j + 1) + "]: ");
                X[i][j] = sc.nextInt();
            }
        }
    }
    public void mostrarMatriz(int[][] X){
        System.out.println("\nMATRIZ X");
        for(byte i = 0; i < X.length; i ++){
            for(byte  j = 0; j < X[i].length; j ++){
                System.out.print(X[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    public void transpuesta(){
        int aux = 0;
        for(byte i = 0; i < X.length; i ++){
            for(byte j = (byte)(i + 1); j < X[i].length; j ++){
                aux = X[i][j];
                X[i][j] = X[j][i];
                X[j][i] = aux;
            }
        }
    }
    
    public void transpuesta2(){
        int aux = 0;
        int l = X.length - 1;
        for(byte i = 0; i < X.length; i ++){
            int k = X.length - 1;
            for(byte j = 0; j < X.length - i - 1; j ++){
                aux = X[i][j];
                X[i][j] = X[i][j];
                X[k][l] = X[i][j];
                k --;
            }
            l --;
        }
    }
    
    public void multiplicar(int[][] X, int[][] Y, int[][] Z){
        int suma;
        for(byte i = 0; i < X.length; i ++){
            for(byte j = 0; j < Y[0].length; j ++){
                suma = 0;
                for(byte k = 0; k < X[0].length; k ++){
                    suma += X[i][k] * Y[k][j];
                }
                Z[i][j] = suma;
                
            }
        }
        
    }
    
    public void multiplicarMatrices(){
        ingresoDatos(A);
        ingresoDatos(B);
        multiplicar(A, B, R);
        mostrarMatriz(R);
    }
}