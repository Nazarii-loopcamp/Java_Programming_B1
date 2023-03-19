package day14_string;

public class RemoveSpace {

    public static void main(String[] args) {

        String day = "  Thursday  ";
        int numOfCharBeforeTrim = day.length();
        System.out.println("Number of characters before trim = " + numOfCharBeforeTrim);

        day = day.trim();
        int numOfAfterTrim = day.length();
        System.out.println("After trim = " + numOfAfterTrim);

        String msg = "   Today we learned good String methods";
        System.out.println(msg.startsWith("Today"));  // False

        msg = msg.trim();
        System.out.println(msg.startsWith("Today")); // True


    }

}
