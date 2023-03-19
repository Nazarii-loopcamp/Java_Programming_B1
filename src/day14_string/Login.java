package day14_string;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your username: ");

        String userName = input.next();

        System.out.println("Before .toLowerCase() method: " + userName);

        userName = userName.toLowerCase();
        System.out.println("After .toLowerCase() method: " + userName);

        System.out.println("Please, enter a password: ");
        String password = input.next();

        // method == > .length();
        int passwordLength = password.length();
        System.out.println(passwordLength);

        if (passwordLength >= 8 && userName.equals("loopcamp")){
            System.out.println("You are logged in as " + userName);
        } else {
            if (passwordLength < 8) {
                System.out.println("Password length does not match");
            }

            if (!userName.equals("loopcamp")) {
                System.out.println("Invalid password.");
            }
        }

    }

}
