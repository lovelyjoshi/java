class Animal {
    void Sound() {
        System.out.println("Dog barks");
    }
}

public class main2 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.Sound();
    }
}
