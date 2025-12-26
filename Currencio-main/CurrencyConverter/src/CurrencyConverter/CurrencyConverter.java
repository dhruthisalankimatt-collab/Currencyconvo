package CurrencyConverter;

import java.util.HashMap;

public class CurrencyConverter {

    private static final HashMap<String, Double> RATES = new HashMap<>();

    static {
        RATES.put("USD", 1.0);
        RATES.put("EUR", 0.92);
        RATES.put("GBP", 0.79);
        RATES.put("INR", 83.20);
    }

    public static double convert(double amount, String from, String to) {
        double usd = amount / RATES.get(from);
        return usd * RATES.get(to);
    }
}
