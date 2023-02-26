package day09_b__if_statements;

import java.util.Scanner;

public class CheckHunger {

    /*
    Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
     */
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Ruslan are you hungry (true or false):");
        boolean isHungry = input.nextBoolean();

        if(isHungry) {
            System.out.println("Lets go to Texas deBrazil");

        }else{

            System.out.println("I can not stay without eating");


        }

    }

}
