package day07_relational_operators;

public class SignType {

    /*



     */

    public static void main(String[] args) {

        int number = 0;
        number--;

        boolean isPositive = number >= 0,
                isNegative = number <= 0,
                isZero = number == 0;

        System.out.println(number + " is bigger than zero: " + isPositive);
        System.out.println(number + " is less than zero: " + isNegative);
        System.out.println(number + " is equal to zero: " + isZero);

        System.out.println(number + " is bigger than zero: " + isPositive);
        System.out.println(number + " is less than zero: " + isNegative);
        System.out.println(number + " is equal to zero: " + isZero);




    }

}
