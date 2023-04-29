package day36_inheritance.hiding;

public class Person {

    String name = "James Bond";

}

class Child extends Person {

    String name = "Tom Jerry";

}

class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        System.out.println("-------------");
        Child child = new Child();
        System.out.println(child.name);
    }
}