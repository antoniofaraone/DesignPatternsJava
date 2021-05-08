package pattern.decorator;

public class Prosciutto extends Decorator {

    public Prosciutto( Component piadina ) {
        this.piadina = piadina;
    }

    @Override
    public String prepara() {
        return piadina.prepara() + aggiungiProsciutto();
    }

    private String aggiungiProsciutto() {
        return "Prosciutto ";
    }
}
