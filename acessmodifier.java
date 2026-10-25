//Write a Java program demonstrating different access modifiers: private, default, protected and public
class Student {

    private int age = 20;
    String name = "Lovely";       // Default
    protected int marks = 85;
    public String city = "Delhi";

    void display() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("City: " + city);
    }
}

class acessmodifier {
    public static void main(String[] args) {

        Student s = new Student();
        s.display();
    }
}