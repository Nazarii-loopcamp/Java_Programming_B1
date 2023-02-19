package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main (String [] Args){

        byte b = 40;
        int i = b; //the byte value is automatically (implicitly) converted to int, because byte is smaller than int.

        int i2 = 100;
        // byte b2 = i2; // Reassigning check the data type first. That is why we can't put it this way.
        byte b2 = (byte)i2; //but with casting we can put like this.


        byte b3 = 100; // Putting a value directly gives a data type automatically checking the range.

        System.out.println("b2: " + b2);
        System.out.println("b3: " + b3);

        int i3 = 130;
        byte b4 = (byte)i3;

        System.out.println("b4: " + b4);

        // WIDENING CONVERSION / WIDENING CASTING (IMPLICITLY)
        // Going from a smaller to a bigger type.
        // This happens automatically.

        // NARROWING CONVERSION / NARROWING CASTING (EXPLICITLY)
        // Going from bigger data type to a smaller one.
        // This happens manually (explicitly)

            // Casting formula;
                    // daType variableName1 = (dataType) variableName2; (variableName2 - > bigger dataType)
                    // EX:
                        // long number = 100;
                        // int i = (int)number;

        char letter1 = 65;  //Implicit casting (automatically)
        char letter2 = 'A'; //Explicit casting (manually)

        byte b5 = 'B';
        char letter3 = (char)b5;
        System.out.println("letter3: " + letter3);

        byte aa = 5;
        char bb = (char)aa;

        System.out.println("bb: " + bb);


        int i10 = 500;
        long l1 = i10; // int is smaller than long, so it will automatically cast.

        long l2 = 200;
        int i11 = (int)l2; // Here is the explicit casting is needed.

        long l3 = 1_000_000_000_000L;
        int i12 = (int)l3;  // Here is the explicit casting needed.

        double d = 50.5;
        System.out.println("d: " + d);

        int i13 = (int)d;
        System.out.println("i13: " + i13);







    }
}
