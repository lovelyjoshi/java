import java.util.Vector;

public class vector {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Apple");
        v.add("Mango");
        v.add("Banana");

        System.out.println(v);

        v.add("Orange");

        System.out.println(v);

        v.remove("Mango");

        System.out.println(v);
    }
}