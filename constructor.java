public class constructor {
    String name;
    int age;

    constructor() {
        name = "rahul";
        age = 20;

    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        constructor c = new constructor();
        c.display();

    }
}
