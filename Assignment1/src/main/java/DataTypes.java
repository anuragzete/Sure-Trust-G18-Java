

public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.4028235E38f;
        double d = 1.7976931348623157E308;
        char c = 'A';
        boolean bool = true;

        // Variables
        int _var1 = 10;
        int $var2 = 20;
        int var3 = 30;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        System.out.println("variable consisting '_' "+ _var1);
        System.out.println("variable consisting '$' "+ $var2);
        System.out.println("variable consisting alphabets "+ var3);
    }
}
