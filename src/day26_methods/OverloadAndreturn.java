package day26_methods;

public class OverloadAndreturn {

    public static void method () {

    System.out.println("Just printing bu default");

    }
    // return type being different does not mean that they are overloaded
    // changing return type does not mean we overloaded the method
//    public static int method () {
//        System.out.println("Just printing bu default");
//        return 1;
//    }

        public static int method (int num) {
        System.out.println("Just printing bu default");
        return 1;
    }

}
