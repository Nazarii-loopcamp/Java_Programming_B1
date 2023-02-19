package day04_variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        System.out.println("1");




        byte age = 55;

        System.out.println("60");  // hard coded
        System.out.println(age);    // dynamic



        byte age2 = 65;
        byte ageTwo = 70;

        System.out.println(age2);
        System.out.println(ageTwo);

        short year; //declare a variable caller year and it's data type is short
        year = 2023; //assinging 2023 to a variable caller year

        //declare a variable called addressNumber and data type is int - assign value of 244545474
        int addressNumber = 244545474;

        // long bugNumber = 3748765872435678976 --> this value is int by default, it is too big and we need assign it to long data type.
        long bugNumber = 3748765872435678976L;  //for the values for long we can put L or l at the end of value;

        age2 = age;

        byte age3 = age2;
        System.out.println(age3);
    }
}
