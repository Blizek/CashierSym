package variables;

public class CashAndChange {
    public static double cash = 0.0;

    public static double change = 0.0;

    public static void setChange(double total) {
        change = cash - total;
    }
}
