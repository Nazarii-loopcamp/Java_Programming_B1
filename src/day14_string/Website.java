package day14_string;

import java.util.Scanner;

public class Website {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the webpage URL: ");
        String url = input.next();

        url = url.toLowerCase();

        boolean validStart = url.startsWith("www.");
        boolean validEnds = url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(".net");

        if (validStart || validEnds) {
            System.out.println(url + " is correct URL");
        } else {
            if (!validStart) {
                System.out.println("URL needs to start with www.");
            }

            if(!validEnds) {
                System.out.println("URL needs to end with \n.com\n.edu\n.gov\n.net");



            }

        }




    }

}
