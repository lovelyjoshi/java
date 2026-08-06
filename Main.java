import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); // Create Scanner object
       System.out.print("Enter your name: ");
       String name = sc.nextLine(); // Read a string
       System.out.print("Enter your age: ");
       int age = sc.nextInt(); // Read an integer
       System.out.print("Enter your salary: ");
       double salary = sc.nextDouble(); // Read a double
       System.out.println("\nUser Details");
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Salary: " + salary);
       sc.close(); // Close scanner
   }
}