class Animal {
    void eat() {
        System.out.println("animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class inherit {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }

}
