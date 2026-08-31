class Student {
    private int age;   // private data

    // Setter method
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method
    public int getAge() {
        return age;
    }
}

public class Main4  {
    public static void main(String[] args) {
        Student s = new Student();

        s.setAge(20);
        System.out.println("Age: " + s.getAge());
    }
}