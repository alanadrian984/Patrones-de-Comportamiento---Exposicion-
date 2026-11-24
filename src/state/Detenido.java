package state;

public class Detenido implements EstadoReproductor {

    @Override
    public void reproducir(Reproductor reproductor) {
        System.out.println("La música ha comenzado a reproducirse.");
    }

    @Override
    public void pausar(Reproductor reproductor) {
        System.out.println("No se puede pausar porque está detenido.");
    }

    @Override
    public void detener(Reproductor reproductor) {
        System.out.println("El reproductor ya está detenido.");
    }
}