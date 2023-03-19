package day14_string;

public class StartAndEnd {

    public static void main(String[] args) {

        String str = "Apples";
        boolean result1 = str.startsWith("App"); // True
        boolean result2 = str.startsWith("app"); // False
        System.out.println("result 1 = " + result1);
        System.out.println("result 2 = " + result2);

        System.out.println(str.startsWith("Apple"));   // True
        System.out.println(str.equals("Apple"));       // False
        System.out.println(str.startsWith("Apples"));  // True

        System.out.println(str.startsWith(" App")); // False;
        System.out.println(str.startsWith(  "App")); // True

        String sentence = "Today is Java day!";
        boolean end1 = sentence.endsWith("day!"); // True
        System.out.println("end1 = " + end1);

        boolean end2 = sentence.endsWith("day"); // false
        System.out.println("end2 = " + end2);

        System.out.println(sentence.endsWith("is Java day!")); // True
        System.out.println(sentence.endsWith("ay!")); // True


    }

}
