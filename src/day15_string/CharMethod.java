package day15_string;

public class CharMethod {

    public static void main(String[] args) {

        String word = "loop"; // 4 characters
        //             0123
        System.out.println(word.length());

        // a method which returns us a char on a given INDEX - .charAt(int);
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        // System.out.println(word.charAt(4));

        String longWord = "safafdvgsdbdvbsdvs";
        //                 0                17
        System.out.println(longWord.length()); //18

        int lastIndex = longWord.length()-1;
        System.out.println(longWord.charAt(lastIndex));

    }

}
