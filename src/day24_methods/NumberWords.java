package day24_methods;

public class NumberWords {

    public static int numOfWords (String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (' ' == sentence.charAt(i)) {
                count++;
            }
        }
        return count+1;
    }

    public static boolean evenOrOddWords (int num) {
        return num % 2 == 0 ? true : false;
    }

    public static void main( String[] args) {
        int numWords = numOfWords("Today is Saturday. It is a Java class day.");
        System.out.println("I have total " + numWords + " words.");
        System.out.println("The total number is even?: " + evenOrOddWords(numWords));
    }

}
