package day22_arrays;

import java.util.Arrays;

public class SplitExample {

    public static void main(String[] args) {

        String days = "Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday";

//        int countWords = 0;
//        for (int i = 0; i < days.length(); i++) {
//            if (days.charAt(i) == ',') {
//                countWords++;
//            }
//        }
//
//        System.out.println("Total words: " + (countWords + 1));

        String [] dayArr = days.split(", ");
        System.out.println(Arrays.toString(dayArr));

        String [] dayArr2 = days.split("ay");
        System.out.println(Arrays.toString(dayArr2));

        String [] dayArr3 = days.split("Wednesday");
        System.out.println(dayArr3.length);
        System.out.println(Arrays.toString(dayArr3));

        System.out.println("===========================");
        String [] dayArr4 = days.split("");
        System.out.println(Arrays.toString(dayArr4));

        System.out.println("===========================");
        String month = "jan-feb-mar-apr-may-jun-jul-aug-sep-oct-nov-dec";
        /*
        Can you print each month
         */
        String [] monthArr = month.split("-");
        for (String eachMonth : monthArr) {
            System.out.println(eachMonth);  // Can you print it all in Upper Case
        }
        System.out.println("========================");
        String [] monthArr1 = month.split("-");
        for (String eachMonth : monthArr1) {
            System.out.println(eachMonth.toUpperCase());
        }
        System.out.println("========================");
        String [] monthArr2 = month.split("-");
        for (String eachMonth : monthArr2) {
            System.out.println(eachMonth.substring(0, 1).toUpperCase() + eachMonth.substring(1).toLowerCase());
        }

    }

}
