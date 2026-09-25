//write a Java program to demonstrate arithmetic, relational, logical, assignment and conditional operators
class OperatorsDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        // Relational operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logical operators
        System.out.println("(a > b) && (a != b): " + ((a > b) && (a != b)));
        System.out.println("(a < b) || (a != b): " + ((a < b) || (a != b)));

        // Assignment operator
        a += 5;
        System.out.println("After a += 5: " + a);

        // Conditional (ternary) operator
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
}