public class Main {
    public static void main(String[] args) {
        // Crear el receptor (Televisor)
        Televisor televisor = new Televisor();

        // Crear el comando (EncenderTelevisor)
        Command encenderComando = new EncenderTelevisor(televisor);

        // Crear el invocador (ControlRemoto)
        ControlRemoto controlRemoto = new ControlRemoto();

        // Asignar el comando al invocador
        controlRemoto.establecerComando(encenderComando);

        // Presionar el botón del control remoto para ejecutar el comando
        controlRemoto.presionarBoton();
    }
}