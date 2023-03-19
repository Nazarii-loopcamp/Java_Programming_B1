package day17_loops;

import java.util.Scanner;

public class SomeOfNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();  // 5

        int numOfSum = 0;

        // continue getting a number from user until it is negative number
        while (num >= 0) {
            numOfSum = numOfSum + num;  // numOfSum += num;
            System.out.println("Sum of the number so far: " + numOfSum);

            System.out.println("Enter number again: ");
            num = input.nextInt();

            if (num < 0) {
                System.out.println(num + " is a negative number. That is why the while loop ended.");
            }

        }

    }

}
