package day14_string;

public class Contain {

    public static void main(String[] args) {

        String sentence = "Judo is more than sport";

        System.out.println(sentence.contains("is more")); // True

        System.out.println(sentence.contains("morethan"));// False

        System.out.println(sentence.contains("is than")); // False

        System.out.println(sentence.contains("is") && sentence.contains("than")); // True True
        System.out.println(sentence.contains("is") || sentence.contains("than")); // True True
        System.out.println(sentence.contains("are") || sentence.contains("than")); // True
        System.out.println(sentence.contains("is") && sentence.contains("the")); // False




    }

}
