import java.io.*;

public class WriteToFile1 {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write("welcome to java file handling");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("an error occured");
        }
    }
}
