package day28_arraylist;

import java.util.ArrayList;

public class AddAndRemove {

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        list.add("Computer");
        list.add("Laptop");
        list.add("Screen");
        list.add("Keyboard");
        list.add("Mouse");
        System.out.println(list);

        // Remove element at the given index
        list.remove(0);
        System.out.println(list);

        // Remove the element at the given index and returns it. Since dataType is String, we can assign it to String variable
        String removed = list.remove(0);
        System.out.println(removed);
        System.out.println(list);

        // Element should exact match ("mouse" will not work)
        list.remove("Mouse");
        System.out.println(list);

        boolean isRemoved = list.remove("Keyboard");
        System.out.println(isRemoved);
        System.out.println(list);

        list.add("Screen");
        list.add("Screen");
        list.add("Screen");
        list.add("Screen");
        System.out.println(list);
        list.remove("Screen");
        // This method removed allways from the beggining
        System.out.println(list);


        // You can remove all the same elements by Iterator which we will cover later.
        // It has a method that check if there is an element before ethe next cycle starts.
        // With traditional loop we will get into an exception because it removes the element and moves everything to left causing an issue reaching element at the end.
        /*
        for ( String each: list) {
            if (each.equals("Screen")){
                list.remove(each);
            }
        }
        System.out.println(list);

         */

    }

}
