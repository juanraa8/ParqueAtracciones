package controlAcceso;

public class SistemaAsignacionCodigos {
    private static int nextId = 0;

    public static synchronized int getNextId() {
        return nextId++;
    }
}