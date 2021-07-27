package variables;

public class Total {
    public static double total = 0.00;

    public static void add(double cost) {
        total += cost;
        total = Math.round(total * 100.0) / 100.0;
    }

    public static void remove(double cost) {
        total -= cost;
        total = Math.round(total * 100.0) / 100.0;
    }
}
