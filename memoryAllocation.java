//Write a Java program to demonstrate memory allocation for objects and the use of constructors.
class Student {

    String name;
    int age;

    // Constructor
    Student() {
        name = "Lovely";
        age = 20;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class memoryAllocation {
    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student();

        // Display data
        s1.display();
    }
}