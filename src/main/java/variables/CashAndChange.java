package variables;

public class CashAndChange {
    public static double cash = 0.0;

    public static double change = 0.0;

    public void setAll(double value) {
        cash = value;
        change = cash - Total.total;
    }
}
