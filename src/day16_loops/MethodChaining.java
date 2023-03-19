package day16_loops;

public class MethodChaining {

    public static void main(String[] args) {

    String word = "    Java is a great language       ";
        System.out.println(word);

    word = word.trim();// Java is a great language
                       //0123456
        System.out.println(word);

     //   word = word.substring(0, 4);
        word = word.substring(0, word.indexOf(" "));
        System.out.println(word);

        System.out.println("===========================");
        word = "    Java is a great language       ";
        System.out.println(word);
        //TODO;Debug
        word = word.trim().substring(0, 4).toLowerCase().toUpperCase();
        // String word2 = word.trim().substring(0, 4).toLowerCase().toUpperCase().contains("ja"); // Not valid data type (contains returns boolean)
        String word4 = word.indexOf(1) + "Hello";
        System.out.println(word);

    }

}
