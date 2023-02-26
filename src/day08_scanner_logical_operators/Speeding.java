package day08_scanner_logical_operators;

public class Speeding {

    public static void main(String[] args) {

        int currentSpeed = 101;
        int speedLimit = 60;
        boolean speeding = currentSpeed > speedLimit;

        System.out.println("Is this person speeding?: " + speeding);

    }

}
