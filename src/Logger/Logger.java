package logger;

public class Logger {

    // Instancia única (estática)
    private static Logger instancia;

    // Constructor privado
    private Logger() {
        System.out.println("Logger creado");
    }

    // Método público para obtener la instancia única
    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    // Método para registrar un mensaje
    public void log(String mensaje) {
        System.out.println("[LOG] " + mensaje);
    }
}