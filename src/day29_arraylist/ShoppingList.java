package day29_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // This will be my shoppingList to hold all the items
        ArrayList <String> shoppingList = new ArrayList<>();
        String wantsContinue;
        int count = 0;

        /*
        Enter item
        - apple
        Do you want to continue y/n?
        -yes / y
         */

        do {
            System.out.println("Enter the item: ");
            // String item = input.nextLine();
            shoppingList.add(input.nextLine());

            System.out.println("Do you want to continue y/n?");
            wantsContinue = input.nextLine(); // Y or N

        } while (wantsContinue.equalsIgnoreCase("Y"));

        System.out.println("Shopping List: " + shoppingList.size() + " item");

        // looping through the list
        for (String each : shoppingList) {
            System.out.println(++count + "\t" + each);
        }
        System.out.println("-----------------");


        // How can I check if my list has water
        System.out.println("Do you want to check if specific item is on the list?");
        String itemToCheck = input.nextLine();
       //  System.out.println(shoppingList.contains("Water") ? "Water is on the list" : "Water is not on the list"); // without dynamic
        System.out.println(shoppingList.contains(itemToCheck) ? (itemToCheck + " is on the list") : (itemToCheck + " is not on the list"));

        // Can you remove specific item from the list?
        System.out.println("Do you want to remove any items y/n?");
        if (input.nextLine().equalsIgnoreCase("y")){
            System.out.println("What item or what number you want to remove?");
            String itemToRemove = input.nextLine();

            // Let's say user may give you either item name or the number of the item in the list --- > "1" | q
            if (Character.isDigit(itemToRemove.charAt(0))) {
                shoppingList.remove(Integer.parseInt(itemToRemove)-1);
            } else {
                shoppingList.remove(itemToRemove);
            }

            // shoppingList.remove(itemToRemove);

        }

        System.out.println("Final list: " + shoppingList);

    }

}
