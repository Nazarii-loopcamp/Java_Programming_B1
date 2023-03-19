package day17_loops;

import java.util.Scanner;

public class ShoppingList {

    /*
    repeated steps:
        ask the user to enter the item
        add item to shopping list
        ask the user if they want to add more items

        at the end show the full shopping list

 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String list = "Shopping list";
        String addMore;

        do {
            System.out.println("Enter the name of the item:");

            //  String newItem = input.next();
            //  list = list + "\n\t" + input.next();
            list += "\n\t" + input.next();

            System.out.println("Do you want to add more to your shopping list? ");
            addMore = input.next();

        } while (addMore.equalsIgnoreCase("yes"));
        System.out.println(list);

    }

}
