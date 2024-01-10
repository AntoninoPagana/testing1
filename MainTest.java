import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MainTest {
    private final Main testing = new Main();

    @Test
    void somma_di_due_interi() {
        Integer result = testing.somma(5, 10);
        assertEquals(15, result, "La somma di 5 e 10 dovrebbe risultare 15");
    }

    @Test
    void somma_se_presente_null() {
        Integer result = testing.somma(null, 10);
        assertNull(result);
    }

    @Test
    void somma_di_due_non_interi() {
        Integer result = testing.somma(-10, -25);
        assertEquals(-35, result, "La somma di -10 e -25 dovrebbe risultare -35");
    }
}