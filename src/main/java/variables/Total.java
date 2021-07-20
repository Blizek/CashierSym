package variables;

public class Total {
    public static double total = 0.00;

    public static void add(double cost) {
        total += cost;
    }

    public static void remove(double cost) {
        total -= cost;
    }
}
