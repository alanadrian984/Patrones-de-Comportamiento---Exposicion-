package state;

public class Reproductor {

    private EstadoReproductor estado;

    public Reproductor() {
        estado = new Detenido();
    }

    public void setEstado(EstadoReproductor estado) {
        this.estado = estado;
    }

    public void reproducir() {
        estado.reproducir(this);
    }

    public void pausar() {
        estado.pausar(this);
    }

    public void detener() {
        estado.detener(this);
    }
}