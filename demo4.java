import java.io.*;

class demo4 {
    public static void main(String[] args)
            throws IOException {
        FileWriter f = new FileWriter("abc.text");
        f.write("hello.java");
        f.close();
        System.out.println("Text written");
    }
}
