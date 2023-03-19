package day17_loops;

import java.util.Scanner;

public class AtmLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ATM");
        int attemptCount = 1;
        int validPin = 1788;
        int userInputPin;

        do {
            System.out.println("Enter a PIN: ");
            userInputPin = input.nextInt();
            attemptCount++;
        } while (attemptCount <= 3 && validPin != userInputPin);

        if (validPin == userInputPin) {
            System.out.println("You are logged in");
        } else {
            System.out.println("You are locked out. Please contact customer service");
        }
    }

}
