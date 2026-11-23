package state;

public interface EstadoReproductor {

    void reproducir(Reproductor reproductor);

    void pausar(Reproductor reproductor);

    void detener(Reproductor reproductor);
}

class Reproductor {
}