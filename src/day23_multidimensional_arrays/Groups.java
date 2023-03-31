package day23_multidimensional_arrays;

import java.util.Arrays;

public class Groups {

    public static void main(String[] args) {

        String [][] groups = new String[3][];

//        String [][] groups = new String[3][2];
//        System.out.println(Arrays.deepToString(groups));

       String [] groupOneNames = {"Ilgar", "Nazarii", "Naima", "Nurdan", "Gina"};
       groups [0] = groupOneNames;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("Adding group 2");
        String [] groupTwoNames = {"Ruslan", "Melek", "Tofik", "Beback", "Sluntyay"};
        groups[1] = groupTwoNames;
        System.out.println(Arrays.deepToString(groups));


        System.out.println("Adding group 3");
        String [] groupThreeNames = {"Feyruz", "Nadir", "Rafik", "Azik", "Ara"};
        groups[2] = groupThreeNames;
        System.out.println(Arrays.deepToString(groups));


        System.out.println("==============================");
        for (String [] eachArr : groups) {
            for (String eachElement : eachArr) {
                System.out.println(eachElement);
            }
            System.out.println("==============================");
        }


    }

}
