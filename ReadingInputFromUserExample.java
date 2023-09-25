import java.awt.*;
import java.util.Scanner;

public class ReadingInputFromUserExample {
    public static void main(String[] args) {
        // create Scanner object to read user's input
        Scanner scanner = new Scanner(System.in);
        // create a prompt to let user enter their name
        System.out.print("Enter your name: ");
        // read user's input and assign to "name" variable
        String name = scanner.next();
        // print the name
        System.out.println("Name: " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Age: " + age);

        System.out.print("Enter your gender(M/F): ");
        char gender = scanner.next().charAt(0);
        System.out.println("Gender: " + gender);

        System.out.print("Enter your Contact Number: ");
        double contact = scanner.nextDouble();
        System.out.println("Contact: " + contact);

    }
}
