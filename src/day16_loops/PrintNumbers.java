package day16_loops;

public class PrintNumbers {

    public static void main(String[] args) {

        int n = 2;

        System.out.println(n);

        while (n <= 100) {
            System.out.println(n);
            n++;
        }

// print only even numbers from 2 to 100
//        while (n <= 100 && n % 2 == 0) {
//            System.out.println(n);
//            n++;                              infinite loop - wrong
//        }

        //

        while (n <= 100) {

            if (n % 2 == 0) {
                System.out.println(n);
                n++;
            }



        }

    }
}
