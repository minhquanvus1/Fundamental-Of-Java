import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
//        int i = 1;
//        while(i <= 10) {
//            System.out.println("Hello World");
//            i++;
//        }
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")) {
            System.out.print("Enter a message: ");
             input = scanner.nextLine().toLowerCase();
             if(input.equals("quit")) {
                 break;
             } else if (input.equals("pass")) {
                 continue;
             }
             System.out.println(input);
        }
    }
}
