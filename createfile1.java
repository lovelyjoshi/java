
import java.io.File;
import java.io.IOException;

public class createfile1 {
    public static void main(String[] args) {
        try {
            File myobj = new File("file1.txt");

            if (myobj.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
}
