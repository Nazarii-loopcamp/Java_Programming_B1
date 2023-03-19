package day17_loops;

public class CountHi {

    public static void main(String[] args) {

        String sen = "aaaaahiaaaahiaaaaahiaaaahi";
        int countOfHi = 0;

        for (int i = 0; i < sen.length(); i++) {

            if (sen.charAt(i) == 'h' && sen.charAt(i+1) == 'i') {
                countOfHi++;
            }

        }
        System.out.println(countOfHi);
    }

}
