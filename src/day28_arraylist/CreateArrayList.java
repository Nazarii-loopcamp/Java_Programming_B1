package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {

    public static void main(String[] args) {

        ArrayList <String> listOne = new ArrayList<>();
        listOne.add("Tom");
        listOne.add("Jerry");
        System.out.println(listOne);

        // We can copy one ArrayList to another one
        ArrayList<String> listTwo = new ArrayList<>(listOne); // Here we create a new ArrayList
        System.out.println(listTwo);
        listTwo = listOne; // Here we did NOT create a new ArrayList object. We are just reffering to the same one as listOne

        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("Name1", "Name2", "Name3"));
        System.out.println(listThree);

        // ArrayList <String> listFour = new ArrayList<>("Name1", "Name2");  not valid.

    }

}
