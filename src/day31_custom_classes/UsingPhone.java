package day31_custom_classes;

public class UsingPhone {

    public static void main(String[] args) {

        Phone phone1 = new Phone("iPhone");
        System.out.println(phone1);

        Phone phone2 = new Phone("iPhone", "Apple");
        System.out.println(phone2);

        System.out.println("----------------------");

        Phone phone3 = new Phone( "Iphone", "Apple", 256, 16.4 );
        System.out.println(phone3);

    }

}
