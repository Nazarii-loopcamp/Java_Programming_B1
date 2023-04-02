package day24_methods;

public class Age {

    public static void calculateAge (int bornYear){
        int currentYear = 2023;
        int yourAge = currentYear - bornYear;

        System.out.println("Method with ONE argument: You are " + yourAge + " old!");

    }

    public static void calculateAge (int bornYear, int currentYear){
        int yourAge = currentYear - bornYear;

        System.out.println("Method with TWO arguments: You are " + yourAge + " old!");

    }

        public static void main (String[]args){

            String name = "Nigar";
            int index = name.indexOf('N');
            String part = name.substring(1, 4);
            String part2 = name.substring(2);

            calculateAge(1991);
            calculateAge(1991, 2023);

        }

    }