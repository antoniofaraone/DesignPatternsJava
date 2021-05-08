package pattern.decorator;

public class Squaquerone extends Decorator {

    public Squaquerone( Component piadina ) {
        this.piadina = piadina;
    }

    @Override
    public String prepara() {
        return piadina.prepara() + aggiungiSquaqurone();
    }

    private String aggiungiSquaqurone() {
        return "Squaquerone ";
    }
}
