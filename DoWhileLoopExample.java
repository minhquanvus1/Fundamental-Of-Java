import java.util.Scanner;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        // always execute the loop at least once
        do {
            System.out.print("Enter a message: ");
            input = scanner.nextLine();
            System.out.println(input);
        } while(!input.equals("quit"));
    }
}
