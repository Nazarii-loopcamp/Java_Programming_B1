package day14_string;

public class EmptyOrBlank {

    public static void main(String[] args) {

        String word1 = "last minutes";
        System.out.println(word1.isEmpty()); // False

        word1 = "";
        System.out.println(word1.isEmpty()); // True
        System.out.println(word1.isBlank()); // False

        word1 = " ";
        System.out.println(word1.isEmpty()); // False
        System.out.println(word1.isBlank()); // True



    }

}
