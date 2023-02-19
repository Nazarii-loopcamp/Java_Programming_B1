package day06_a_arithmetic_operators;

public class House {
    public static void main (String [] Args){

      /*
    Create a class House
    create a main method
    - Each the datatype you feel is most appropriate for each variable.
    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),
    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
     */

        String houseType = "Single House";
        int numberOfBed = 5;
        int numbOfBath = 5;
        int numbOfKith = 2;
        boolean isABase = false;
        boolean isAnAttic = true;
        boolean isThePool = true;
        boolean isItOnSale = false;
        double cost = 1_000_000.99;
        String address = "123 Central Ave";
        int zipCode = 12345;
        boolean hasPark = true;
        double school = 4.6;

        String houseInfo = "The " + houseType + " on " + address + ", " + zipCode + " costs $" + cost + "\nThe " + houseType + " has " + numberOfBed + " bedrooms, " + numbOfBath + " bathrooms, " + numbOfKith + " kitchens" + "\nIt also includes a basement: " + isABase + ", has an attic: " + isAnAttic + ", has a pool: " + isThePool + ", is on sale: " + isItOnSale + ", and has a park: " + hasPark + "\nThe schools in the area have a rating of " + school;

        System.out.println(houseInfo);



    }
}
