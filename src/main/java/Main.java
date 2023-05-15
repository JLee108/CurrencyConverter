import CurrencyConverter.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        converter.add("USD", 1.0);
        converter.add("EUR", 0.92);
        converter.add("GBP", 0.80);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter currency to convert from: ");
        String fromCountry = scanner.nextLine();

        System.out.print("Enter currency to convert to: ");
        String toCountry = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        Double result = converter.convert(amount, fromCountry, toCountry);
        System.out.println("Result: " + result + " " + toCountry);
    }
}