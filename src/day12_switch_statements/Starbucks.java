package day12_switch_statements;

import java.util.Scanner;

public class Starbucks {

    /*

 Declare price and calories variables

 Ask the user to enter which size drink they want

 Based on the drink size determine the price and calories of the order

 At the end print the details of the order

     data:

         size: tall
         price: 2.50
         calories: 100

         size: grande
         price: 4.00
         calories: 150

         size: venti
         price: 4.50
         calories: 200

  */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double price = 0.0;
        int calories = 0;

        System.out.println("What size of coffee would You like? ");
        String size = input.next();
        boolean isSize = true;



        switch (size) {
            case "tall":
                price = 3.49;
                calories = 150;
                break;
            case "grande":
                price = 5.49;
                calories = 250;
                break;
            case "venti":
                price = 7.49;
                calories = 400;
                break;
            default:
                System.out.println("We do not have that size");
                isSize = false;



        }

        if (isSize)
        System.out.println("Your order for " + size + " coffee price is $" + price + " and calories " + calories);

    }

}
