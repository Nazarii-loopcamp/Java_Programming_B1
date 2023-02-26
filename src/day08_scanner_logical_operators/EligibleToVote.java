package day08_scanner_logical_operators;

public class EligibleToVote {

    public static void main(String[] args) {

       String name = "John";
       boolean isCitizen = true;
       boolean hasCriminal = true;
       int age = 49;

       boolean isEligible;
       isEligible = age >= 18 && isCitizen && !hasCriminal;
       //           true      &&   true         false
        //                 true     &&     false
        //                        false

        System.out.println(name + " is eligible to vote: " + isEligible);

        isEligible = age >= 18 && isCitizen && hasCriminal;

        System.out.println(name + " is eligible to vote: " + isEligible);

    }

}
