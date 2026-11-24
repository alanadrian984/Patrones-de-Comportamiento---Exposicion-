package state;

public class Reproduciendo implements EstadoReproductor {

    @Override
    public void reproducir(Reproductor reproductor) {
        System.out.println("La música ya está reproduciéndose.");
    }

    @Override
    public void pausar(Reproductor reproductor) {
        System.out.println("La música está en pausa.");
    }

    @Override
    public void detener(Reproductor reproductor) {
        System.out.println("La reproducción se ha detenido.");
    }
}

class Pausado implements EstadoReproductor {

    @Override
    public void reproducir(Reproductor reproductor) {
        System.out.println("La reproducción se ha reanudado.");
    }

    @Override
    public void pausar(Reproductor reproductor) {
        System.out.println("La música ya está en pausa.");
    }

    @Override
    public void detener(Reproductor reproductor) {
        System.out.println("La reproducción se ha detenido.");
    }
}

class Detenido implements EstadoReproductor {

    @Override
    public void reproducir(Reproductor reproductor) {
        System.out.println("La reproducción ha comenzado.");
    }

    @Override
    public void pausar(Reproductor reproductor) {
        System.out.println("No se puede pausar: la reproducción está detenida.");
    }

    @Override
    public void detener(Reproductor reproductor) {
        System.out.println("La reproducción ya está detenida.");
    }
}