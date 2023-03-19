package day12_switch_statements;

import java.util.Scanner;

public class Calculator {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        double num1 = input.nextDouble();

        System.out.println("Enter 2nd number");
        double num2 = input.nextDouble();

        System.out.println("Select operator: \n\t+\n\t-\n\t*\n\t/\n\t%");
        String operator = input.next();

        boolean isValid = true;

        double result = 0;

        switch (operator){

            case "+":
                result = num1 + num2;
                break;
            case "-":
                // if num1 > num2 ---> num1 - num2
                // else num2 - num1
                if (num1 > num2) {
                    result = num1 - num2;
                } else {
                    result = num2 - num1;
                }
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                // 4 / 0 - invalid
                // 0 / 4 - valid
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Can't divide by 0");
                }
                break;
            case "%":
                // 4 / 0 - invalid
                // 0 / 4 - valid
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Can't divide by 0");
                }
                break;
            default:
                System.out.println(operator + " is not valid for this calculator");
                isValid = false;

        }
        if (isValid) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);


        }
    }

}
