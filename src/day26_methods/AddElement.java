package day26_methods;

import java.util.Arrays;

public class AddElement {

    // create a method that accept int array and an int value
    // Then adds that value at the end of array
    // Then return that array

    public static void main(String[] args) {

        int [] arr = {23, 4, 6, 6}; // size = 4

        add(arr, 67);

    }

    public static int [] add (int [] arr, int num) {

        int [] newArr = Arrays.copyOf(arr, arr.length+1);
        System.out.println(Arrays.toString(newArr));
        newArr[newArr.length-1] = num;
        System.out.println(Arrays.toString(newArr));
        return newArr;

    }

    public static String [] add (String [] arr, String num) {

        String [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = num;

        return newArr;

    }


//      This is another way with for loop.
//    public static int [] add (int [] arr, int num) {
//
//        int [] newArr = new int[arr.length+1];
//
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i];
//        }
//        newArr[newArr.length-1] = num;
//
//        return newArr;
//
//    }

}
