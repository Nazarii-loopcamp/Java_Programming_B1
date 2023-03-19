package day11_if_statements;

public class FizzBuzz {

     /*
    num = 10
    if num / 3
    "Fizz"
    if num / 5
    "Buzz"
    if / 3 || 5
    "FizzBuzz"
    if num / false
    "num"
     */

    public static void main(String[] args) {

        int num = 45;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        }else{
            System.out.println(num);
        }


    }

}
