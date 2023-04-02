package day24_methods;

public class Email {

    public static void generateEmail (String name, String domain) {
        String email = name.toLowerCase() + "@" + domain.toLowerCase() + ".com";
        System.out.println("Your email address: " + email);
     }

    public static void generateEmailFromName (String fullName, String domain) {

        String email = fullName.substring(0, fullName.indexOf(" ")).toLowerCase() + "@" + domain.toLowerCase() + ".com";
        System.out.println(email);

    }

    public static void main(String[] args) {

        generateEmail("Gunel", "Gmail");  // gunel@gmail.com
        generateEmail("Vafa", "Yahoo");

        System.out.println();
        generateEmailFromName("Nazarii Duvanov", "Gmail");

    }

}
