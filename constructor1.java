//parameterized constructor
public class constructor1 {

    String name;
    int age;

    constructor1(String n, int a) {
        name = n;
        age = a;

    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        constructor1 c1 = new constructor1("riya", 20);
        constructor1 c2 = new constructor1("siya", 19);

        c1.display();
        c2.display();

    }
}
