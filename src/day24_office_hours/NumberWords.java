package day24_office_hours;

import java.util.Scanner;

public class NumberWords {

    public static String numWord (int num) {

//        if (num == 1) {
//            return "One";
//        } else if (num == 2) {
//            return "Two";
//        }

        String [] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        return words[num - 1];


    }

    public static void main(String[] args) {

        numWord(1);
        String result = numWord(2);

        System.out.println(numWord(1));
        System.out.println(result);

        System.out.println("=============");
        System.out.println(numWord(5));

        System.out.println(numWord(13));

        System.out.println("=======================");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get word: ");
        int userNum = input.nextInt();
        System.out.println(numWord(userNum));


    }

}
