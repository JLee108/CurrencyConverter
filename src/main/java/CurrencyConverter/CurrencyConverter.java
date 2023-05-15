package CurrencyConverter;

import java.util.HashMap;

public class CurrencyConverter {
    private HashMap<String, Double> exchangeRates;

    public CurrencyConverter() {
        this.exchangeRates = new HashMap<>();
    }

    public void add(String currency, double rate) {
        this.exchangeRates.put(currency, rate);
    }

    public Double convert(double amount, String fromCurrency, String toCurrency) {
        double exchangeFrom = this.exchangeRates.get(fromCurrency);
        double exchangeTo = this.exchangeRates.get(toCurrency);
        // method was returning a double but this was the output
        // Result: 9.200000000000001 EUR
        // Didn't like it so formatted to print only 2 decimal places
        // Update: can't seem to do the formatting correctly, will look at it later
        return amount * (exchangeTo / exchangeFrom);
    }
}
