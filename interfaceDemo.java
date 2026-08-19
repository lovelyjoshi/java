interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() {
        System.out.println("hello");
    }

    public void showB() {
        System.out.println("lovely");
    }

}

public class interfaceDemo {

    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();

    }

}
