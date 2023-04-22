package day33_a_static;

public class Iphone {

    String model;
    double price;
    static String company = "Apple";
    static String os = "IOS";
    static boolean appleDay= false;

    static {
        company = "Apple";
        os = "IOS";
        appleDay = false;
    }

    public Iphone (String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return "Iphone Info:" + "\n\tModel:\t" + model + "\n\tPrice:\t" + price;
    }

}
