public class Multiply {
    public static Double multiply(Double a, Double b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Arguments is illegal");
        }
        return a * b;
    }
}
