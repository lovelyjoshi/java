//Write a Java program to demonstrate the basic concepts of encapsulation, inheritance and polymorphism using a suitable example
class Animal {
    // Encapsulation
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Method for polymorphism
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Inheritance
class Dog extends Animal {

    // Method overriding - Polymorphism
    void sound() {
        System.out.println("Dog barks");
    }
}

class OOPDemo {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Encapsulation
        d.setName("Tommy");
        System.out.println("Dog Name: " + d.getName());

        // Polymorphism
        d.sound();
    }
}
