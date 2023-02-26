package day09_a__scanner;

import java.util.Scanner;

public class UsingNext {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Today's Saturday");
        System.out.println("What is todays class? ");  // Java

        String className = input.next();

        System.out.println();


        System.out.println("What month is it? ");  // February
        String month = input.next();
        System.out.println("I like " + month + " month");
        System.out.println();


        input.nextLine();
        System.out.println("Enter your full name: "); //multiple words - has space in it
        String fullName = input.nextLine();
        System.out.println("Full name is: " + fullName);

        input.close(); // it's optional. We do not really HAVE to use it ( for BACK GROUND).


    }
}
