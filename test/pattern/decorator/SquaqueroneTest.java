package pattern.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaqueroneTest {

    private Component piadina;
    private Decorator squaquerone;

    @Test
    void prepara() {
        piadina = new Piadina();
        squaquerone = new Squaquerone( piadina );
        assertEquals(squaquerone.prepara(), "Piadina Squaquerone ");
    }

}