package observer;

public class Pantalla implements Observer {
    private final String nombre;

    public Pantalla(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String estado) {
        System.out.println("[" + nombre + "] Nuevo estado recibido: " + estado);
    }
}
