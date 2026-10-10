//Write a Java program to demonstrate single inheritance.
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class singleinheritanceDemo {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}