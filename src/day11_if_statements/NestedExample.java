package day11_if_statements;

import java.util.Scanner;

public class NestedExample {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number");

        int number = input.nextInt();

        if (number >= 0 && number <=10) {   // Outer if condition
            if (number % 2 == 0) {
                System.out.println("Even"); // Inner if condition
            } else {
                System.out.println("Odd");
            }
        } else {
            System.out.println("The number is not in the range");
        }


    }

}
