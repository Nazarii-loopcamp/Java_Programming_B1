package day30_a_arraylist;

/*
    Input:
    “123”, “34”, “513” Output:
    [ 6, 7, 9 ]
 */

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {

    public static ArrayList <Integer> addNums (ArrayList <String> list) {

        ArrayList <Integer> listOfSums = new ArrayList<>();

        for (String each : list) {

            int sumOfEach = 0;
            for (String each1 : each.split("")){
                sumOfEach += Integer.parseInt(each1);

            }
            listOfSums.add(sumOfEach);
        }
        return listOfSums;
    }

    public static void main(String[] args) {
        System.out.println(addNums(new ArrayList<>(Arrays.asList("123", "34", "513"))));
    }

}
