package strategy;

public class MainStrategy {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras(new PagoTarjeta("**** 4821"));
        carrito.procesarPago(85000.0);

        carrito.setEstrategiaPago(new PagoEfectivo());
        carrito.procesarPago(42000.0);
    }
}