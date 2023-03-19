package day15_string;

public class IndexOfMethod3 {
    public static void main(String[] args) {

        String str = "definition";
        System.out.println("First i: " + str.indexOf("i"));
        System.out.println("Last i: " + str.lastIndexOf("i"));

        int firstIindex = str.indexOf("i");
        System.out.println(str.indexOf("i", firstIindex+1));

    }
}
