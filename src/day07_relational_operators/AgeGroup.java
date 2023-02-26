package day07_relational_operators;

public class AgeGroup {

    /*

    declare and assign an age variable

    check if the person is a kid
        age --- > up 13 (include 13)

    check if the person is adult
        age --- > 30 or higher

     */
    public static void main(String[] args) {

        int ageOfPerson = 40;

        boolean isKid = ageOfPerson <= 13; // value has to be TRUE or FALSE ALWAYS
        System.out.println("You are a kid. Correct? " + isKid);

        boolean isAdult = ageOfPerson >= 30;

        System.out.println("You are an adult. Correct? " + isAdult);


    }

}
