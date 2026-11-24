package state;

public class Pausado implements EstadoReproductor {

    @Override
    public void reproducir(Reproductor reproductor) {
        System.out.println("La música continúa reproduciéndose.");
    }

    @Override
    public void pausar(Reproductor reproductor) {
        System.out.println("La música ya está pausada.");
    }

    @Override
    public void detener(Reproductor reproductor) {
        System.out.println("La reproducción se ha detenido.");
    }
}