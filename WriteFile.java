
import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fin = new FileWriter("abc.text");
            fin.write("hello.java");
            fin.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
}
