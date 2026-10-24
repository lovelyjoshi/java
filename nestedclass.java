//Write a Java program to demonstrate nested classes and inner classes.
class Outer {

    void display() {
        System.out.println("This is outer class");
    }

    // Inner class
    class Inner {
        void show() {
            System.out.println("This is inner class");
        }
    }

    // Static nested class
    static class Nested {
        void print() {
            System.out.println("This is static nested class");
        }
    }
}

class nestedclass {
    public static void main(String[] args) {

        // Outer class object
        Outer obj = new Outer();
        obj.display();

        // Inner class object
        Outer.Inner in = obj.new Inner();
        in.show();

        // Static nested class object
        Outer.Nested n = new Outer.Nested();
        n.print();
    }
}