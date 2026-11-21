import java.util.Scanner;

class reverse {
    int n;

    void getdata(int i) {
        n = i;
    }

    void putdata() {
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n = n / 10;
        }
        System.out.println("reverse " + rev);
    }

    public static void main(String[] args) {
        int m;
        reverse obj = new reverse();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no to find reverse");
        m = sc.nextInt();
        obj.getdata(m);
        obj.putdata();
    }
}
