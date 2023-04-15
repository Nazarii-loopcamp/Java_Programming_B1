package day30_b_custom_classes;

/*
    create object of Item and assing "Apple" to the name instance variable and 3.99 to prices instance variable.
 */

public class UsingItem {

    public static void main(String[] args) {

        Item fruit = new Item();
        System.out.println(fruit); // If you write this line of code and if you do not have toString() method in Item class -- > it will show some memory location

        fruit.name = "Apple";
        fruit.price = 3.99;

        System.out.println(fruit);

        System.out.println("=============");
        Item fruit2 = new Item();
        fruit2.name = "Banana";
        fruit2.price = 2.99;
        System.out.println(fruit2);

    }

}
