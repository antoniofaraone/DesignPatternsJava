package pattern.decorator;

public class Main {

    public static void main( String[] args ) {
        Component piadina = new Piadina();
        System.out.println(piadina.prepara());

        Decorator prosciutto = new Prosciutto( piadina );
        System.out.println(prosciutto.prepara());

        Decorator squaquerone = new Squaquerone( piadina );
        System.out.println(squaquerone.prepara());

        Decorator squaquerone2 = new Squaquerone( prosciutto );
        System.out.println(squaquerone2.prepara());

    }
}
