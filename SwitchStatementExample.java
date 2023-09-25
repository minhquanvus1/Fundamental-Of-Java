import java.util.Scanner;

public class SwitchStatementExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("admin - get full access");
        System.out.println("subadmin - get access to create/delete course");
        System.out.println("testprep - get access to create/delete test");
        System.out.println("user - get access to consume content");
        System.out.print("Enter your choice: ");
        String user = scanner.nextLine();

        switch (user) {
            case "admin":
                System.out.println("Get full access");
                break;
            case "subadmin":
                System.out.println("get access to create/delete course");
                break;
            case "testprep":
                System.out.println("get access to create/delete test");
                break;
            case "user":
                System.out.println("get access to consume content");
                break;
            default:
                System.out.println("You are a trial user");
                break;
        }
    }
}
