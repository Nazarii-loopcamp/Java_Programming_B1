package day19_nested_loop;

public class NestedLoopExample {

    public static void main(String[] args) {



        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Loop Academy");
        }
        System.out.println("===========================");

        for (int i = 1; i <= 2; i++) {
            System.out.println("This is th e number " + i + " iteration");
            for (int j = 0; j < 5; j++) {
                System.out.println("Hello Loop Academy");
            }
            
        }
    }

}
