package day08_scanner_logical_operators;

public class Discount {

    public static void main(String[] args) {

        boolean isItWeekend = false;
        boolean areYouTeacher = false;
        boolean areYouPoliceOff = false;
        boolean areYouAFirefighter = false;

        boolean discount = isItWeekend && (areYouTeacher || areYouPoliceOff || areYouAFirefighter);

        System.out.println("Do you get discount?: " + discount);


    }

}
