package day15_string;

import java.util.Scanner;

public class ShortestWithA {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter 3 words: ");
        String wordOne = input.next();
        String wordTwo = input.next();
        String wordThree = input.next();

        int wordOneLength = wordOne.length(),
                wordTwoLength = wordTwo.length(),
                wordThreeLength = wordThree.length();

        String result = "";

        if (wordOne.contains("a") && (wordOneLength <= wordTwoLength && wordOneLength <= wordThreeLength)) {
            result = wordOne + " is the shortest with \"a\"";
        } else if (wordTwo.contains("a") && (wordTwoLength <= wordOneLength && wordTwoLength <= wordThreeLength)){
            result = wordTwo + " is the shortest with \"a\"";
        } else if (wordThree.contains("a") && (wordThreeLength <= wordOneLength && wordThreeLength <= wordTwoLength)) {
            result = wordThree + " is the shortest with \"a\"";
        } else {
            result = "No single shortest word with \"a\"";
        }
        System.out.println(result);
    }

}

