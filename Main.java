//Ho ripreso un esercizio sulla calcolatrice testando la somma.
public class Main {
    public static void main(String[] args) {

    }

    public static Integer somma(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new ArithmeticException();
        }
        return a + b;
    }
}
