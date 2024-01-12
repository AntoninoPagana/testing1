import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void somma_di_due_interi() {
        Integer result = Main.somma(5, 10);
        assertEquals(15, result, "La somma di 5 e 10 dovrebbe risultare 15");
    }

    @Test
    void somma_di_due_non_interi() {
        Integer result = Main.somma(-10, -25);
        assertEquals(-35, result, "La somma di -10 e -25 dovrebbe risultare -35");
    }

    //Cercato su Internet (Come gestire un eccezione aritmetica in testing)
    @Test
    public void somma_gestioneEccezione() {
        assertThrows(ArithmeticException.class, () -> {
            Main.somma(null, 3);
        });

        assertThrows(ArithmeticException.class, () -> {
            Main.somma(2, null);
        });
    }

}