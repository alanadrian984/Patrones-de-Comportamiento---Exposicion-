package strategy;

public class PagoTarjeta implements EstrategiaPago {
    private final String numeroEnmascarado;

    public PagoTarjeta(String numeroEnmascarado) {
        this.numeroEnmascarado = numeroEnmascarado;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con tarjeta (" + numeroEnmascarado + ").");
    }
}