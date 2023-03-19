package day16_loops;

public class OddNumbers {

    public static void main(String[] args) {

        int num = 2;

        // print numbers from 2 to 200 which are Odd

        System.out.println(num);

        while (num <= 100) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
            num++;
        }

    }
}