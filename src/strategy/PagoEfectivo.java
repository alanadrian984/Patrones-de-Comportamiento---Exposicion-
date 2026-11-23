package strategy;

public class PagoEfectivo implements EstrategiaPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " en efectivo en caja.");
    }
}