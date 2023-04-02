package day24_methods;

public class GetCharacters {

    public static void printAToZ () {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char)i + " ");
        }
        System.out.println("==============");
    }

    public static void printaToz () {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println((char)i + " ");
        }
        System.out.println("==============");
    }

    public static void printZToA () {
        for (int i = 'Z'; i >= 'A'; i--) {
            System.out.println((char)i + " ");
        }
        System.out.println("==============");
    }

    public static void print0To9 () {
        for (int i = 0; i <= 9; i++) {
            System.out.println(i + " ");
        }
        System.out.println("==============");
    }

    public static void main(String[] args) {
        printAToZ();
        printaToz();
        printZToA();
        print0To9();
    }

}
