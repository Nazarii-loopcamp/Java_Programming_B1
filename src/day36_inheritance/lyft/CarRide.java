package day36_inheritance.lyft;

public class CarRide {
    public static void main(String[] args) {

        Lyft obj1 = new Lyft("Nazarii");
        System.out.println(obj1.calculateRate(50));

        LyftXL obj2 = new LyftXL("Feyruz");
        System.out.println(obj2.calculateRate(50));
    }
}
