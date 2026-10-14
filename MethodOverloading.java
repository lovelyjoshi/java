//Write a Java program to demonstrate method overloading.
class MethodOverloading {

    // Method with two integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        System.out.println("Sum of two numbers: " + obj.add(10, 20));
        System.out.println("Sum of three numbers: " + obj.add(10, 20, 30));
    }
}