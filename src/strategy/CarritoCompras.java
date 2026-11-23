package strategy;

public class CarritoCompras {
    private EstrategiaPago estrategiaPago;

    public CarritoCompras(EstrategiaPago estrategiaPago) {
        this.estrategiaPago = estrategiaPago;
    }

    public void setEstrategiaPago(EstrategiaPago estrategiaPago) {
        this.estrategiaPago = estrategiaPago;
    }

    public void procesarPago(double monto) {
        if (estrategiaPago == null) {
            System.out.println("No se ha seleccionado un metodo de pago.");
            return;
        }
        estrategiaPago.pagar(monto);
    }
}