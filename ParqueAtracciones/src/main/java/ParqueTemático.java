package controlAcceso;

public class ParqueTematico {
    private static ParqueTematico instance = new ParqueTematico();

    private ParqueTematico() {}

    public static ParqueTematico getInstance() {
        return instance;
    }

    // Other methods for managing the park
}