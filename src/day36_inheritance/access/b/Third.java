package day36_inheritance.access.b;

import day36_inheritance.access.a.First;
// DIFFERENT class and DIFFERENT package
public class Third {
    public static void main(String[] args) {
       // Third obj = new Third();
       // This Third class obj can ONLY access to it OWN class instance.

        First obj = new First();
        System.out.println(obj.one);
 //       System.out.println(obj.two);
 //       System.out.println(obj.three);
 //       System.out.println(obj.four);

        // Line 11 - is PUBLIC and accessible in all Project.
        // Line 12 - is PROTECTED. Since there is no INHERITANCE, it is not accessible in defferent package.
        // Line 13 - is DEFAULT. It will be ONLY accessible in the SAME package.
        // Line 14 - PRIVATE. It is ONLY available in the SAME class
    }
}
