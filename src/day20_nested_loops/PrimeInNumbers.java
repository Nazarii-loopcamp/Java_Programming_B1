package day20_nested_loops;

public class PrimeInNumbers {

    /*
    [IQ] Prime in range

    Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            50 -- > 1 ....................................... 50
        Output:
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

 */

    public static void main(String[] args) {

        int num = 50;

        for (int i = 2; i <= num; i++) {   // 2, 3, 4, 5, 6, 7  ........

            int count = 0;

            // i = 7
            /*
                  7 % 2
                  7 % 3
                  7 % 4
                  7 % 5
                  7 % 6
                  7 % 7
             */

            for (int j = 2; j <= i; j++) {

                if (i % j == 0) {         // 7 % 2 == 0  --- > false
                    count++;              // 7 % 3
                                          // 7 % 4
                }                         // 7 % 5
                                          // 7 % 6
            }                             // 7 % 7              true  --- > count = 1;

            if (count == 1) {
                System.out.println(i + ", ");
            }

        }

    }

}
