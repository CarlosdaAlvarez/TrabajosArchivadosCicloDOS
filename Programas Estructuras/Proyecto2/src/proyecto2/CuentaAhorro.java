package proyecto2;

public class CuentaAhorro extends Cuenta {
    public double saldo;
    public double interes = 0.05;
    public CuentaAhorro(String titular, double saldo) {
        super(titular);
        this.saldo = saldo;
    }
    public void mostrarSaldo() {
        System.out.println("Saldo de la cuenta de ahorro: $" + saldo);
    }

    public void mostrarTipoInteres() {
        double interesAplicado = saldo * interes;
        System.out.println("Interes aplicado al saldo: $" + interesAplicado);
    }
}
