//Ho ripreso un esercizio sulla calcolatrice testando la somma.
public class Main {
    public static void main(String[] args) {

    }

    public static Integer somma(Integer a, Integer b) {
        if (a == null || b == null) {
            return null;
        }
        return a + b;
    }

    public static Integer sottrazione(Integer a, Integer b) {
        return a - b;
    }

    public static Double divisione(Double a, Double b) {
        return a / b;
    }

    public static Integer moltiplicazione(Integer a, Integer b) {
        return a * b;
    }
}
