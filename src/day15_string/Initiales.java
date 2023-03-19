package day15_string;

import java.util.Scanner;

public class Initiales {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first = input.next();
        System.out.println("Enter last name: ");
        String last = input.next();

        String initials = "" + first.charAt(0) + last.charAt(0);
        initials = initials.toUpperCase();
        System.out.println("Your initial is: " + initials);

    }

}
