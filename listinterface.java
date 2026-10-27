import java.util.*;

class listinterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Mango");
        list.add("Apple");

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}