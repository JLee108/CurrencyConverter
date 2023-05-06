import CurrencyConverter.Currency;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Currency currency = new Currency();
        currency.add("US", 1.00);
        currency.add("UK", 0.87);

        System.out.println(currency);

    }

}