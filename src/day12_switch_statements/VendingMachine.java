package day12_switch_statements;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the wending machine");
        System.out.println("Please, select one of the followings: \n\tDrinks\n\tSnacks\n\tGum\n\nEnter");

        String selection = input.next();

        String msg = "";

        switch (selection) {

            case "Drinks":
                System.out.println("\nYour choise drinks: \n\t1) Water\n\t2) Soda\n\t3) Juice");
                int drinkNumb = input.nextInt();

                if (drinkNumb == 1) {
                    msg = "You have selected water";
                } else if (drinkNumb == 2) {
                    msg = "You have selected soda";
                } else if (drinkNumb == 3) {
                    msg = "You have selected juice";
                } else {
                    msg = "Wrong input";
                }
                break;

            case "Snacks":
                System.out.println("\nYour choise snacks: \n\t1) Candies\n\t2) Pringles\n\t3) Chips");
                int snackNumb = input.nextInt();

                if (snackNumb == 1) {
                    msg = "You have selected water";
                } else if (snackNumb == 2) {
                    msg = "You have selected soda";
                } else if (snackNumb == 3) {
                    msg = "You have selected juice";
                } else {
                    msg = "Wrong input";
                }
                break;

            case "Gum":
                System.out.println("\nYour choise gums: \n\t1) Turbo\n\t2) LoveIs...\n\t3) Stimorol");
                int gumNumb = input.nextInt();

                if (gumNumb == 1) {
                    msg = "You have selected water";
                } else if (gumNumb == 2) {
                    msg = "You have selected soda";
                } else if (gumNumb == 3) {
                    msg = "You have selected juice";
                } else {
                    msg = "Wrong input";
                }
                break;
            default:
                msg = "Not valid selection";
        }

        System.out.println(msg);
    }

}
