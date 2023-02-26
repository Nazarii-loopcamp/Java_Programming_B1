package day09_b__if_statements;

public class SingleIfExample {

    public static void main(String[] args) {


        // If condition is true print out "Today is java day"

        if (true) {

            System.out.println("Today is java day");
        }
//        System.out.println("Today is java day");


        // several number of days in Feb = 28
        int numberOfDay = 28;

        if (numberOfDay == 28) {
            System.out.println("This month is February");
        }
        numberOfDay = 30;
        if (numberOfDay == 28);{

            System.out.println("This month is February");
        }

        int quizResult = 50;
        int passRate = 40;
        if (quizResult >= passRate) {
            System.out.println("Passes the exam.");

        }

        if (quizResult < passRate){
            System.out.println("Failing the exam");
        }

        int year = 2021;


        // If year is equal or bigger than 2020 AND less than or equal to 2022 ---> it is true
        boolean covidYears = year >= 2020 && year <= 2022;  //  year == 2021 || year == 2022

        if(!covidYears){

            System.out.println("It was Covid a Covid year");
        }



    }
}