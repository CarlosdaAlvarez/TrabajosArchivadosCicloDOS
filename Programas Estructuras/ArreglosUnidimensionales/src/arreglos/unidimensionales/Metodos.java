package arreglos.unidimensionales;
import java.util.Scanner;

public class Metodos {
    Scanner sc;
    int[] arreglo;
    int ev;
    
    public Metodos(){
    this.sc = new Scanner(System.in);
    this.arreglo = new int[10];
    this.ev = 0;
    }
    public int Menu(){
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("[1] Insertar Completo");
        System.out.println("[2] Recorrer el Arreglo");
        System.out.println("[3] Buscar");
        System.out.println("[4] Insertar al Inicio");
        System.out.println("[5] Insertar Ordenada");
        System.out.println("[6] Eliminar");
        System.out.println("[7] Ordenar");
        System.out.println("[8] Buscar un Numero");
        System.out.println("[0] Salir");
        return sc.nextInt();
    }
    public int LeerDato(){
        System.out.print("Ingrese un Dato: ");
        return sc.nextInt();
    }
    
    public void LeerCompleto(){
        int num;
        for(int i = 0; i < arreglo.length; i ++){
            arreglo[i] = LeerDato();
        }
        ev = arreglo.length;
    
    }
    public void Presentar(){
        for(int i = 0; i < ev; i ++){
            System.out.print(arreglo [i] + " ");
        }
    }
    
    public void Buscar(){
        int num, resp;
        num = LeerDato();
        resp = Secuencial(num);
        if(resp != -1){
            System.out.println("El Numero " + num + " esta en la Posicion " + resp);
        }else
            System.out.println("No Existe el Numero " + num);
    }
    
    public int Secuencial(int num){
        for(int i = 0; i < ev; i ++){
            if(num == arreglo[i])
                return i;
        }
        return -1;
    }
    
    public void RecorrerDer(int pos){
        for(int i = ev; i > pos; i --){
            arreglo[i] = arreglo[i - 1];
        }
    }
    
    public void InsInicio(){
        if(ev < arreglo.length){
            RecorrerDer(0);
            arreglo[0] = LeerDato();
            ev ++;
        }else{
            System.out.println("No hay Espacio");
        }
    }
    public void pe(){
        int num = LeerDato();
        if(Secuencial(num) == -1){
            arreglo[ev] = num;
        }else{
            
        }
    
    }
    public void InsOrden(){
        if(ev < arreglo.length){
            int num = LeerDato();
            int pos = 0;
            while((pos < ev) && (num > arreglo[pos])){
                pos ++;
            }
            RecorrerDer(pos);
            arreglo[pos] = num;
            ev ++;
        }else{
            System.out.println("No hay Espacio...");
        }
    
    }
    public void Eliminar(){
        int res,num;
        num = LeerDato();
        res = Secuencial(num);
        if(res != -1){
            RecorrerIzq(res);
            ev --;
            
        }else{
            System.out.println("No esta...");
        }
    }
    public void RecorrerIzq(int pos){
        for(int i = pos; i < ev-1; i++){
            arreglo[i] = arreglo[i + 1];
        }
    }
    public void Burbuja() {
    int aux;
    for (int i = 0; i < ev - 1; i++) 
        for (int j = 0; j < ev - 1 - i; j++) {
            if (arreglo[j] > arreglo[j + 1]) { 
                aux = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = aux; 
            }
        }
    
    }
    public int binaria(int num, int inicio, int fin){
        if(inicio <= fin){
            int medio = (inicio + fin)/ 2;
            if(num == arreglo[medio]){
                return medio;
            }else if(num > arreglo[medio]){
                return binaria(num, medio + 1, fin);
            }else{
                return binaria(num, inicio, medio - 1);
            }               
        }else{
            return -1;
        }
    }
    public void BuscarNumero(){
        int num = LeerDato();
        int pos = binaria(num, 0, ev - 1);
        if(pos != -1)
            System.out.println("Esta en la Posicion " + pos);
        else
            System.out.println("No Existe...");
  
    }
       
}
