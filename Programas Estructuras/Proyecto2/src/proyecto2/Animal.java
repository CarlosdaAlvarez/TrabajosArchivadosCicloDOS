package proyecto2;

public class Animal {
    public String tipo;
    public int edad;

    public Animal(String tipo, int edad) {
        this.tipo = tipo;
        this.edad = edad;
    }

    void mostrarEtapaVida() {
        if (edad <= 3) {
            System.out.println("Soy un cachorro");
        } else {
            System.out.println("Soy un adulto");
        }
    }
}
