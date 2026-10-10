//Write a Java program to demonstrate multilevel inheritance.
// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Parent class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

class multilevelInheritancedemo {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}