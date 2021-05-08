package pattern.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PiadinaTest {
    Component piadina;

    @Test
    void prepara() {
        piadina = new Piadina();
        assertEquals( piadina.prepara(), "Piadina " );
    }
}