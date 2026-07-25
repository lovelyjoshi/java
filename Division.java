import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Division {
    public static void main(String[] args) {
        String choice = new String();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("choose your division");
        System.out.println("Honours");
        System.out.println("First");
        System.out.println("Third");
        System.out.println("Fail");
        try {
            choice = br.readLine();
            System.out.flush();
            switch (choice) {
                case "Honours":
                    System.out.println("Marks>=80%");
                    break;
                case "First":
                    System.out.println("Marks>=80%");
                    break;
                case "Second":
                    System.out.println("Marks>=80%");
                    break;
                case "Third":
                    System.out.println("Marks>=80%");
                    break;
                case "Fail":
                    System.out.println("Marks>=80%");
                    break;
            }
        } catch (Exception e) {
            System.out.println("i/o error");
        }
    }
}