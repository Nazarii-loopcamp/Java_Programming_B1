package day12_switch_statements;

import java.util.Scanner;

public class WeekSchedule {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String dayOfWeek = input.next();
        String message = "";

        switch (dayOfWeek) {
            case "Monday":
            case "Mon":
            case "MONDAY":
            case "Friday":
            case "Fri":
            case "FRIDAY":
//                System.out.println("We do not have a class");
                  message = "We do not have a class";
                  break;
            case "Wednesday":
            case "Thursday":
                message = "We have Java class at 7 p.m.";
                break;
            case"Saturday":
                message = "We have Java class at 9.30";
                break;
            case "Sunday":
                message = "We have Soft Skills";
                break;
            default:
                message = "Sunday is more than valid";




        }

        System.out.println(message);

    }

}
