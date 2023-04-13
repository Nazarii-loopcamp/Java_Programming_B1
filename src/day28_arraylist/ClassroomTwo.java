package day28_arraylist;

import java.util.ArrayList;

public class ClassroomTwo {

    public static void main(String[] args) {

        ArrayList <String> group = new ArrayList<>();
        // add always to the end
        System.out.println(group);
        group.add("Gunel");

        // add to the given index
        System.out.println(group);
        group.add(0, "Nataliia");
        System.out.println(group);

        // method overloading is happening
        group.add("Vlad");
        group.add(0, "Khoshqadam");
        System.out.println(group);

    }

}
