package grouplearning.corejava.basics.primitiveDatatypes;

public class JavaPrimitiveDataType {
    public static void main(String[] args) {

        /**
         * byte: byte is numeric type
         */
        byte b = 127;

        System.out.println("byte Min Value: " + Byte.MIN_VALUE);
        System.out.println("byte Max Value: " + Byte.MIN_VALUE);
        System.out.println("byte Byte size: " + Byte.BYTES);

        /**
         * int
         */
        int i = 10;

        System.out.println("int Min Value: " + Integer.MIN_VALUE);
        System.out.println("int Max Value: " + Integer.MIN_VALUE);
        System.out.println("int Byte size: " + Integer.BYTES);

        /**
         * long
         */
        long l = 10L;

        System.out.println("long Min Value: " + Long.MIN_VALUE);
        System.out.println("long Max Value: " + Long.MIN_VALUE);
        System.out.println("long Byte size: " + Long.BYTES);

        /**
         * float
         */
        float f = 12.34f;

        System.out.println("float Min Value: " + Float.MIN_VALUE);
        System.out.println("float Max Value: " + Float.MIN_VALUE);
        System.out.println("float Byte size: " + Float.BYTES);

        /**
         * double
         */
        double d = 123.45;
        System.out.println("double Min Value: " + Double.MIN_VALUE);
        System.out.println("double Max Value: " + Double.MIN_VALUE);
        System.out.println("double Byte size: " + Double.BYTES);

        /**
         * char
         */
        char c = 'a';

        System.out.println("char Min Value: " + Character.MIN_VALUE);
        System.out.println("char Max Value: " + Character.MIN_VALUE);
        System.out.println("char Byte size: " + Character.BYTES);

        /**
         * String
         *
         * Note: String in Java is immutable. When you add two strings,
         *       it creates a third string as the result.
         */
        String s = "hello";

        /**
         * s + ", how are you" returns a new String, and assigns to s.
         */
        s = s + ", how are you";

        /**
         * Array
         *
         * In Java, you can have arrays of any data types, primitive and non-primitive (classes, interfaces etc)
         */
        int [] a1 = new int[10];

        a1[0] = 5;
        a1[1] = 10;
        a1[2] = 16;

        /**
         * get a random number in Java
         */
        double d2 = Math.random();
        System.out.println("Random number:" + d2);
    }
}
