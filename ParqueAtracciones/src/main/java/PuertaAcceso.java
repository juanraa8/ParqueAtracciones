package controlAcceso;

public class PuertaAcceso {
    private Semaphore semaphore;

    public PuertaAcceso(int permits) {
        this.semaphore = new Semaphore(permits);
    }

    public void acceder(Visitor visitor) throws InterruptedException {
        semaphore.acquire();
        System.out.println("Visitante " + visitor.getId() + " accede a la puerta.");
        // Simulate a delay
        TimeUnit.SECONDS.sleep(1);
        semaphore.release();
    }
}