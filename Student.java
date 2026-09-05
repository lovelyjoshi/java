public class Student {

    int rollNo;
    String name;
    double marks;

    // Parameterized Constructor
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Calculate Percentage
    double calculatePercentage() {
        return marks / 100;
    }

    // Display Result
    void displayResult() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }

    // Main Method
    public static void main(String[] args) {

        Student s1 = new Student(101, "Lovely", 85);

        s1.displayResult();
    }
}
