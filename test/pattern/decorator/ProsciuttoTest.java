package pattern.decorator;

import org.junit.jupiter.api.Test;
import pattern.decorator.Component;
import pattern.decorator.Piadina;
import pattern.decorator.Decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProsciuttoTest {

    private Component piadina;
    private Decorator prosciutto;

    @Test
    void prepara() {
        piadina = new Piadina();
        prosciutto = new Prosciutto( piadina );
        assertEquals( prosciutto.prepara(), "Piadina Prosciutto " );
    }
}