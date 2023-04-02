package day24_methods;

public class VoidVsReturn {

    public static void sayHello () {
        System.out.println("Hello");
    }

    public static String sayBye () {
        return "Bye";

    }

    public static void main(String[] args) {

        sayHello();
        sayBye();  // This is just returning a String --- "Bye. But not doing anything with it.

        System.out.println("===========");
        System.out.println(sayBye()); // The method sayBye(); returns a String - "Bye" and then I am printing it out.

        System.out.println("===========");
        String result = sayBye() + " Feyruz";
        System.out.println(result);

    }

}
