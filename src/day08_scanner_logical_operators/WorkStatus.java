package day08_scanner_logical_operators;

import java.util.Scanner;

/*

create Scanner object
        ask the user to enter their first name - next
        ask the user to enter their last name - next
        ask the user if they are employed - boolean
        ask the user if they are a student - boolean

 */
public class WorkStatus {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        System.out.print("How are you? ");
        String feeling = input.next();

        System.out.print("What is the best team?");
        String team = input.next();

        input.nextLine();
        System.out.println("How much are you making? ");
        String answer = input.nextLine();




        System.out.println("First name:\t" + firstName + "\nLast name:\t" + lastName);
        System.out.println("How are you:\t" + feeling);
        System.out.println("Best team ever:\t" + team);
        System.out.println("How much are you making?\t" + answer);


    }

}
