package state;

public class Main {

    public static void main(String[] args) {

        Reproductor reproductor = new Reproductor();

        reproductor.reproducir();

        reproductor.pausar();

        reproductor.reproducir();

        reproductor.detener();

        reproductor.pausar();
    }
}