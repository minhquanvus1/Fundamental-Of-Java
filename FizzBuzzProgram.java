import java.util.Scanner;

public class FizzBuzzProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= number; i++) {
            // we need to check the " % 3 == 0 && i % 5 == 0" both of these conditions FIRST, because if we put "i % 3 == 0" first for example, if we enter 15, which is divisible by both 3 and 5, then 15 will go into the category of ONLY DIVISIBLE BY 3, which is incorrect, so we need to start with the most general one
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}
