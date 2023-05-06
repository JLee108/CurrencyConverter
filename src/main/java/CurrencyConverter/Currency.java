package CurrencyConverter;

import java.util.HashMap;

public class Currency {
    //hashmap for currency mapping to country
    HashMap<String, Double> countryCurrency;
    public Currency() {
        this.countryCurrency = new HashMap<>();
    }

    public void add(String country, Double currency) {
        countryCurrency.put(country, currency);
    }

}
