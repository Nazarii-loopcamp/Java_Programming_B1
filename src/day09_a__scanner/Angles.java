package day09_a__scanner;

import java.util.Scanner;

public class Angles {

    public static void main(String[] args) {

        Scanner angles = new Scanner (System.in);

        System.out.println("Enter 3 ange numbers");

        double a = angles.nextDouble(),
               b = angles.nextDouble(),
               c = angles.nextDouble();

        double total = a + b + c;

        // Write a print statement that print if it is triangle.
        System.out.println("It is triangle: " + (total == 180));

        // Write a print statement that print if it is circle.
        System.out.println("It is a circle: " + (total == 360));

        System.out.println("It is either triangle or circle: " + (total == 180 || total == 360));



    }

}
