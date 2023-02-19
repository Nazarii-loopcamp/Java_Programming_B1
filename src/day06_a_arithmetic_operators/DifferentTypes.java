package day06_a_arithmetic_operators;

public class DifferentTypes {
    public static void main(String[] args) {

        // two int types
        System.out.println(10 - 5);  // 5
        // two int types
        System.out.println(5 * 10);  // 50
        System.out.println(10.0 / 5);// 2.0 - because 10.0 it's double type

        // int / double  - > double
        System.out.println(10 / 5.0); // 2.0

        System.out.println((int)(10.0 / 5.0)); // 2 - because narrowing casting to int

        System.out.println((double)5 * 2);    //10.0
                            // 5.0 * 2 --> 10.0

        System.out.println((double)(5 * 2));  //10.0
                            // (double)(10) --> 10.0

        byte b1 = 5;
        short s1 = 6;

        System.out.println(b1 * s1); // 30





    }
}
