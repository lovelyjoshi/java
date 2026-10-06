//Write a Java program to demonstrate type casting between primitive data types.

class TypeCastingDemo {
    public static void main(String[] args) {

        // Implicit type casting
        int a = 10;
        double b = a;

        System.out.println("Implicit Casting:");
        System.out.println("Integer value: " + a);
        System.out.println("Double value: " + b);

        // Explicit type casting
        double x = 20.5;
        int y = (int) x;

        System.out.println("\nExplicit Casting:");
        System.out.println("Double value: " + x);
        System.out.println("Integer value: " + y);
    }
}
