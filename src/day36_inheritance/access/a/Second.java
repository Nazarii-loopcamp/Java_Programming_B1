package day36_inheritance.access.a;
// DIFFERENT class but SAME package
public class Second {
    public static void main(String[] args) {
       // Second obj = new Second();
        // This Second class object can ONLY access to it's OWN instances

        // This is the class we want to use the object access to FIRST class
        First obj = new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
      //  System.out.println(obj.four);
      // Since the instance variable four is Private it is only accessible in the class level. If we want to access them we can do it indirectly by using Setters and Getters
    }
}
