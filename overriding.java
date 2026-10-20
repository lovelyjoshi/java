//Write a Java program to demonstrate method overriding.
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Overriding the parent class method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class overriding {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}