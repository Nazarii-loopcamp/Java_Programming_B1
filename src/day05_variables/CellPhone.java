package day05_variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "apple";
        String model = "iPhone 13 Pro Max";
        String color = "white";
        double price = 1299.99;
        short storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        // I have an iPhone 13 Pro Max from apple
        System.out.println("I have an" + model + " from " + brand);

        // It came in the color white and it has 256 GB
        System.out.println("It came in the color " + color + " and it has " + storage + " GB");

        // For the type A with a camera the total price was $
        System.out.println("For the sim type " + sim + " with a camera " + hasCamera + " the total price was $" + price);

        System.out.println();

//        String fullMessage = "I have an " + model + " from " + brand + "\nIt came in color" + color + " and it has " + storage + " GB " + "with a camera" + hasCamera



    }
}
