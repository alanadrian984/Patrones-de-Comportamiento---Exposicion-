package observer;

public class MainObserver {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();

        Pantalla pantalla1 = new Pantalla("Pantalla Principal");
        Pantalla pantalla2 = new Pantalla("Pantalla Secundaria");

        sujeto.suscribir(pantalla1);
        sujeto.suscribir(pantalla2);

        sujeto.setEstado("Cargando datos...");
        sujeto.setEstado("Listo");

        sujeto.desuscribir(pantalla1);
        sujeto.setEstado("Actualización final");
    }
}
