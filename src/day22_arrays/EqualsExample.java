package day22_arrays;

import java.util.Arrays;

public class EqualsExample {

    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4};
        int [] b = {1, 2, 3, 4};
        int [] c = a;

        System.out.println(a == b); // Two different objects, can't be compared.
        System.out.println(a == c); // Since array c point array a, the OUTPUT will be TRUE
        System.out.println(Arrays.equals(a, b));


        boolean result = Arrays.equals(b, c);
        System.out.println(result);


    }

}
