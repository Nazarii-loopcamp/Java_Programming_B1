package day18_loops;

import java.util.Scanner;

public class ReverseMiddle {

    /*

 Given a String with three words separated by spaces. Reverse only the second word and return the modified String
     Ex:
     I love java

     Ouput:
     I evol java
  */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 word sentence: ");
        String str = input.nextLine();
        String reverse = "";

        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ");

        String middle = str.substring(firstSpace + 1, lastSpace);

        for (int i = middle.length() - 1; i >= 0; i--) {
            reverse += middle.charAt(i);
        }

        System.out.println(str.substring(0, firstSpace) + " " + reverse + " " + str.substring(lastSpace + 1));


    }

}
