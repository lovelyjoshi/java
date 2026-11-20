import java.util.Scanner;

class add {
    int a, b;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        a = sc.nextInt();
        System.out.println("enter second number: ");
        b = sc.nextInt();
    }

    void putdata() {
        System.out.println("Addition " + (a + b));
    }

    public static void main(String[] args) {
        add obj = new add();
        obj.getdata();
        obj.putdata();
    }
}
