import java.io.*;

class filestream {
    public static void main(String[] args)
            throws IOException {
        FileOutputStream f = new FileOutputStream("abc.text");
        f.write(65);
        f.close();
        System.out.println("Data written");
    }
}