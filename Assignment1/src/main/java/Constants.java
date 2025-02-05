

public class Constants {
    public static void main(String[] args) {
        // Constants
        final int MAX_VALUE = 2147483647;
        final double PI = 3.14159;
        final String NAME = "John";
        final boolean FLAG = true;
        final char CHARACTER = 'A';

        // This will cause an error
        // FLAG = false;

        System.out.println("MAX_VALUE: " + MAX_VALUE);
        System.out.println("PI: " + PI);
        System.out.println("NAME: " + NAME);
        System.out.println("FLAG: " + FLAG);
        System.out.println("CHARACTER: " + CHARACTER);
    }
}
