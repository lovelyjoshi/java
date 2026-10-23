//Write a Java program to demonstrate nested classes and inner classes.
class Outer {

    void display() {
        System.out.println("Outer class method");
    }

    // Inner class
    class Inner {
        void show() {
            System.out.println("Inner class method");
        }
    }
}

class nesteddemo {
    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.display();

        // Creating inner class object
        Outer.Inner in = obj.new Inner();
        in.show();
    }
}