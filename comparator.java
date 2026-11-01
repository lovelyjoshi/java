import java.util.Comparator;
import java.util.ArrayList;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

public class comparator {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("date");
        words.sort(new StringLengthComparator());
        System.out.println(words);
    }

}