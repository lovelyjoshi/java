
import java.io.*;

public class createfile2 {
    public static void main(String[] args) {
        try {
            File myobj = new File("abc.txt");

            if (myobj.createNewFile()) {
                System.out.println("File Created: " + myobj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
}
