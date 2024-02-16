package controlAcceso;

public class Atraccion {
    private static Atraccion instance = new Atraccion();

    private Atraccion() {}

    public static Atraccion getInstance() {
        return instance;
    }

    // Other methods for managing the attractions
}