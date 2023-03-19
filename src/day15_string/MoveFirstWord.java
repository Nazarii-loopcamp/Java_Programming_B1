package day15_string;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        // 1 - get index of first part
        int firstIndexOfSpace = sentence.indexOf(" ");
        // 2 - get the first word
        String beginning = sentence.substring(0, firstIndexOfSpace);
        // 3 - second part of the sentence
        String secondPart = sentence.substring(firstIndexOfSpace).trim();
        // String secondPart = sentence.substring(firstIndexOfSpace + 1);


        System.out.println(beginning);
        System.out.println(secondPart);

        System.out.println(secondPart + " " + beginning);

    }
}
