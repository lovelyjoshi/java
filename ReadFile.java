
import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("abc.text");
            int i;

            while ((i = fin.read()) != -1) {
                System.out.println((char) i);
            }

            fin.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
}
