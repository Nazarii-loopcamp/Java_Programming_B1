package day12_switch_statements;

import java.util.Scanner;

public class ArmyQuality {

    /*
Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.

    - The person must be a citizen or a resident
        -> If not print: You must be a citizen or a resident
    - Their age must be between 18 and 35
        -> If not print: Your age must be between 18 to 35 years old
    - They must have a high school diploma
        -> If not print: You must have a high school diploma

    > If all the criteria is met print: You are qualified for the Army
 */

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        boolean isCitizen,
                isResident,
                hasHighSchoolDiploma;
        int age;

        System.out.println("Are you a citizen? ");
        // I need to get the value/info/answer from user and asign to isCitizen
        isCitizen = input.nextBoolean();

        System.out.println("\nAre you resident? ");
        // I need to get the value/info/answer from user and assign to isREsident
        isResident = input.nextBoolean();

        System.out.println("Do you have a high school diploma (true/false)? ");
        hasHighSchoolDiploma = input.nextBoolean();

        System.out.println("How old are you? ");
        age = input.nextInt();

        // You are either eligible else you are not.
        if ((isCitizen || isResident) && (age >= 18 && age <= 35) && hasHighSchoolDiploma) {
            System.out.println("You are qualified for the Army");
        } else {
            if (!isCitizen && !isResident) {
                System.out.println("You must be a citizen or a resident");
            }

            if (age < 18 | age > 35) {
                System.out.println("Your age must be between 18 to 35 years old");
            }

            if (!hasHighSchoolDiploma) {
                System.out.println("You must have a high school diploma");
            }

        }


    }

}
