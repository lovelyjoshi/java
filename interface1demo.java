//Write a Java program to demonstrate multiple inheritance through interfaces.
interface A {
    void display();
}

interface B {
    void show();
}

class C implements A, B {

    public void display() {
        System.out.println("Interface A method");
    }

    public void show() {
        System.out.println("Interface B method");
    }
}

class interface1demo {
    public static void main(String[] args) {

        C obj = new C();

        obj.display();
        obj.show();
    }
}