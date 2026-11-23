public class ApagarTelevisor implements Command {

    private Televisor televisor;

    public ApagarTelevisor(Televisor televisor) {
        this.televisor = televisor;
    }

    @Override
    public void ejecutar() {
        televisor.apagar();
    }
}