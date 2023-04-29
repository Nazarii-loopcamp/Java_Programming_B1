package day36_inheritance.access.b;

import day36_inheritance.access.a.First;
// DIFFERENT Package and DIFFERENT Class but with INHERITANCE relation
public class Fourth extends First {
    public static void main(String[] args) {
       // Fourth obj = new Fourth();
       // This Fourth class obj can ONLY access to it OWN class instance.
        First obj = new First();
        System.out.println(obj.one);
      //  System.out.println(obj.two);
      //  System.out.println(obj.three);
      //  System.out.println(obj.four);
        // The above Line 11, 12, 13 are not accessible with the Parent class obj in the CHILD class.

        Fourth obj2 = new Fourth();
        System.out.println(obj2.one);
        System.out.println(obj2.two);
     //   System.out.println(obj2.three);
     //   System.out.println(obj2.four);

        // Line 18 - Since there is INHERITANCE between FOURTH class and FISRT class, the object of FOURTH class inherits all the accessible fields and methods of it's PARENT class. In this case, since the child class is in a DIFFERENT package, I am still able to access the PROTECTED and PUBLIC variables/methods.
        // Line 19 - is default. It will be ONLY accessible in the SAME package.
        // Line 20 - PRIVATE. It is ONLY available in the SAME class.
    }
}
