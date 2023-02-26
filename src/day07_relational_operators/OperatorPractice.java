package day07_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {

        int i = 5;
        //        6     5

        int y = -i++ + --i + i++ / i--;
        // y = -5    +  5  + 5   / 6
        // y = -5    +  5  + 0
        //                   5%6 =  5
        y = 0;

        // pre
        // post

        System.out.println(i);
        System.out.println(y);

        // int a = 5/5;  4/5 = 0 - because int can take only whole numbers;
        // int b = 13%8 = 5;

        // 13 / 8 = 1 (8/8) + 5/8


    }
}
