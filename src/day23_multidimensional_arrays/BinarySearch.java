package day23_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int [] num = {4, 10, 30, 200};
        System.out.println(Arrays.binarySearch(num, 4));
        System.out.println(Arrays.binarySearch(num, 10));
        System.out.println(Arrays.binarySearch(num, 200));
        System.out.println(Arrays.binarySearch(num, 50));

    }

}
