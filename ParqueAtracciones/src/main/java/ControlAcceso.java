package controlAcceso;

import java.util.concurrent.Semaphore;

public class ControlAcceso implements Runnable {
    private Semaphore semaforoAtraccion;
    private Visitante visitante;

    public ControlAcceso(Semaphore semaforoAtraccion) {
        this.semaforoAtraccion = semaforoAtraccion;
    }

    public void setVisitor(Visitor visitante) {
        this.visitante = visitante;
    }

    @Override
    public void run() {
        try {
            System.out.println("Visitante " + visitante.getId() + " se acerca al control de acceso.");
            semaforoAtraccion.acquire();
            System.out.println("Visitante " + visitante.getId() + " ha pasado el control de acceso.");
            // Simulate a delay
            TimeUnit.SECONDS.sleep(1);
            semaforoAtraccion.release();
            System.out.println("Visitante " + visitante.getId() + " ha salido del control de acceso.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}