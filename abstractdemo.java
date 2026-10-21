//Write a Java program to demonstrate an abstract class and abstract methods.
abstract class Animal {

    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    // Implementing abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

class abstractdemo {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}