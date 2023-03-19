package day16_loops;

public class MiddleChar {

    public static void main(String[] args) {

        String word = "Californi";  // 10 characters
        //             0123456789

        boolean isEven = word.length()%2 == 0;

        if (isEven) {

            System.out.println(word.substring(word.length()/2-1, word.length()/2+1)); //

        } else {

            // "Californi";  // 9 characters
            //  012345678
            System.out.println(word.substring(word.length()/2, word.length()/2 + 1));  // 9 / 2 = 4
            System.out.println(word.charAt(word.length()/2)); // this is also fine if it is a single character

        }

        word = "Califohellornia";

        System.out.println(word.indexOf("hello")); // 6

        System.out.println(word.indexOf("quiz"));  // -1

    }

}
