package day24_methods;

public class MathMethods {

    public static void add (int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void minus (double num1, double num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void divide (double num1, double num2) {

        if (num2 == 0) {
            System.out.println("We can not divide by 0");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }

    }

    public static void main(String[] args) {

        add(34, 495);
        add(1991, 54);
        // add(34.5, 44.2); -- > Will give error because int data type can't hold double characters.

        minus(34.5, 44.2);
        minus(30, 15);

        System.out.println();
        divide(20, 4);
        divide(20, 0);


    }

}
