//Write a Java program to accept command-line arguments and perform arithmetic operations on two numbers.
class commandlineDemo {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}