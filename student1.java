//encapsulation
public class student1 {
    private String name;
    private int age;
    private int roll;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setroll(int roll) {
        this.roll = roll;
    }
}

class student {
    public static void main(String[] args) {
        student1 obj = new student1();
        obj.setName("riya");
        obj.setAge(18);
        obj.setroll(23);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getRoll());

    }
}
