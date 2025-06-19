package proyecto2;

public class Cuenta {
    public String titular;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public void mostrarTitular() {
        System.out.println("Titular de la cuenta: " + titular);
    }
}
