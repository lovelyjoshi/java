import java.util.*;

class main5 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("Apple");
        s.add("Mango");
        s.add("Apple");
        s.add("Banana");

        System.out.println(s);
        System.out.println(s.size());
    }
}