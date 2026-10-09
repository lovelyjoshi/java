//Write a Java program to demonstrate constructor overloading.
class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        name = "Lovely";
        age = 20;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class ConstructorDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Rahul", 21);

        s1.display();
        s2.display();
    }
}