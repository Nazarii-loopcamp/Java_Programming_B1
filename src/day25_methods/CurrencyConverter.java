package day25_methods;

/*
create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

    Use the following information to convert from given dollars to the desired currency type

    1 dollar = 0.91 euro
    1 dollar = 121.03 yen
    1 dollar = 14.85 lira
    1 dollar = 1,217.52 won
    1 dollar = 181.45 rupee

    Note: Don't worry about decimal formats, focus on method

    Ex:
        Input:
            euro, 100

        Output:
            91

    Ex:
        Input:
            yen, 50

        Output:
            6051.5
 */

import java.util.Locale;

public class CurrencyConverter {

    public static double currency (String currencyType, double currencyAmount) {

       // currencyType = currencyType.toLowerCase();

        double afterConvert = 0;
        switch (currencyType.toLowerCase()) {
            case "euro":
               return currencyAmount * 0.91;
            case "yen":
                return currencyAmount * 121.03;
            case "lira":
                return currencyAmount * 14.85;
            case "won":
                return currencyAmount * 1217.52;
            case "rupee":
                return currencyAmount * 181.45;
            default:
                System.out.println("Not valid currency");
                return 0.0;
        }

    }

    public static void main(String[] args) {
        System.out.println("You converted currency: " + currency("euro", 500));
        System.out.println("You converted currency: " + currency("Won", 500));
        System.out.println("You converted currency: " + currency("lIrA", 500));
    }

}
