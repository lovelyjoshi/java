import java.util.*;

class hashset {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        s.add("apple");
        s.add("mango");
        s.add("apple");
        System.out.println(s);
        System.out.println(s.size());
    }
}