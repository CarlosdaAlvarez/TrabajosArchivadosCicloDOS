package proyecto2;

public class Proyecto2 {

    public static void main(String[] args) {
        System.out.println("Herencia");
        Perro p = new Perro("Mamifero", "pitbull", 31, 3);

        p.ladrar();
        p.mostrarEtapaVida();
        p.verificarVacunas();
   
        System.out.println("\nCuentas Bancarias:");
        CuentaAhorro ahorro = new CuentaAhorro("Ricardo", 1000.00);
        ahorro.mostrarTitular();
        ahorro.mostrarSaldo();
        ahorro.mostrarTipoInteres();

        CuentaCorriente corriente = new CuentaCorriente("Ana Perez", 1500.00);
        corriente.mostrarTitular();
        corriente.mostrarSaldo();
        corriente.mostrarTipoInteres();
    }
}