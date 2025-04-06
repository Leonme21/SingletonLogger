package logger;

public class App {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstancia();
        logger1.log("Mensaje desde el módulo A");

        Logger logger2 = Logger.getInstancia();
        logger2.log("Mensaje desde el módulo B");

        // Verificamos que ambas variables apuntan al mismo objeto
        System.out.println("¿Logger1 y Logger2 son la misma instancia? " + (logger1 == logger2));
    }
}

