import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main testing = new Main();

    @Test
    void sommaDiDueInteri() {
        Integer result = testing.somma(5, 10);
        assertEquals(15, result, "La somma di 5 e 10 dovrebbe risultare 15");
    }

    @Test
    void sommaDiDueNonInteri() {
        Integer result = testing.somma(-10, -25);
        assertEquals(-35, result, "La somma di -10 e -25 dovrebbe risultare -35");
    }

    @Test
    public void sommaGestioneEccezioneNull() {
        try {
            Integer result = testing.somma(null, 5);
            assertNull(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

}