package controlAcceso;

public class VisitanteDecorator implements Visitor {
    private Visitor visitor;

    public VisitanteDecorator(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public int getId() {
        return visitor.getId();
    }

    public void setAzafata(Azafata azafata) {
        azafata.setVisitor(visitor);
    }

    public void setControlAcceso(ControlAcceso controlAcceso) {
        controlAcceso.setVisitor(visitor);
    }
}