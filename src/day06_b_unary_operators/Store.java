package day06_b_unary_operators;

public class Store {
    public static void main(String[] args) {

        String store = "Target";
        int numberOfTv = 100;

        System.out.println("I have a total of " + numberOfTv + "TVs");
        System.out.println("Person comes into the store and they bought a TV");
        //numberOfTv = numberOfTv - 1;
        System.out.println("Number of TVs left in the store: " + --numberOfTv);

        System.out.println("Another person comes into the store and puts the TV into his cart");
        System.out.println("Available TV in the store: " + numberOfTv--);
        System.out.println("The same person who had the the TV in his cart bought the TV");
        System.out.println("Now we have TV in total: " + numberOfTv);



    }
}
