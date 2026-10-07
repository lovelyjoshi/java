//Write a Java program to create a class and objects and demonstrate the use of instance variables and methods.
class Student {

    // Instance variables
    String name;
    int age;

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class instance {
    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student();
        Student s2 = new Student();

        // Assigning values
        s1.name = "Lovely";
        s1.age = 20;

        s2.name = "Rahul";
        s2.age = 21;

        // Calling method
        s1.display();
        s2.display();
    }
}
