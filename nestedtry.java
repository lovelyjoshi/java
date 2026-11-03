public class nestedtry {
    public static void main(String[] args) {
        try {
            System.out.println("outer try");
            try {
                int a = 10, b = 0, c;
                a = a / b;
            } catch (ArithmeticException e) {
                System.out.println("division by zero");
            }
        } catch (Exception e) {
            System.out.println("outer Catch");

        }
    }
}
