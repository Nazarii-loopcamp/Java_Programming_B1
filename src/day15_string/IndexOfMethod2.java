package day15_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {

        String str = "lopooooop";
        //            012345678

        System.out.println(str.indexOf("o"));  // 1`
        System.out.println(str.indexOf("o", 2));

        System.out.println(str.indexOf("o", str.indexOf("o")+1));
        //                                                      1 + 1 = 2
    }
}
