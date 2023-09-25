public class TernaryOperatorExample {
    public static void main(String[] args) {
        boolean isAuthenticated = true;
        // NORMAL IF-ELSE
//        if(isAuthenticated) {
//            System.out.println("You logged in successfully!");
//        } else {
//            System.out.println("You didn't log in successfully!");
//        }

        // TERNARY OPERATOR
        String result = isAuthenticated ? "Logged in" : "Not logged in";
        System.out.println(result);
    }
}
