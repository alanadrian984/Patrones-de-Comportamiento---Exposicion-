public class ControlRemoto {

    private Command comando;

    public void establecerComando(Command comando) {
        this.comando = comando;
    }

    public void presionarBoton() {
        if (comando != null) {
            comando.ejecutar();
        } else {
            System.out.println("No hay ningún comando asignado.");
        }
    }
}