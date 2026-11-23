package observer;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {
    private final List<Observer> observadores = new ArrayList<>();
    private String estado;

    public void suscribir(Observer observador) {
        if (observador != null && !observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void desuscribir(Observer observador) {
        observadores.remove(observador);
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificar();
    }

    public String getEstado() {
        return estado;
    }

    private void notificar() {
        for (Observer observador : observadores) {
            observador.actualizar(estado);
        }
    }
}