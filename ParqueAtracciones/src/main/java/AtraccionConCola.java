package controlAcceso;

public class AtraccionConCola {
    private ColaVisitantes colaVisitantes;

    public AtraccionConCola(ColaVisitantes colaVisitantes) {
        this.colaVisitantes = colaVisitantes;
    }

    public void accederAtraccion(Visitor visitor) throws InterruptedException {
        colaVisitantes.addVisitor(visitor);
        System.out.println("Visitante " + visitor.getId() + " accede a la cola de la atracción.");
        // Simulate a delay
        TimeUnit.SECONDS.sleep(1);
    }
}