public class overloading {
    void add(int a, int b) {
        System.out.println("sum =" + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("sum =" + (a + b + c));
    }

    public static void main(String[] args) {
        overloading obj = new overloading();
        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}
