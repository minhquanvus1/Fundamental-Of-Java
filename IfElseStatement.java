public class IfElseStatement {
    public static void main(String[] args) {
//        float sellingPrice = 1200F;
//        float costPrice = 1000F;
//
//        if(sellingPrice > costPrice) {
//            System.out.println("Profit");
//        }
//        if(costPrice > sellingPrice) {
//            System.out.println("Loss");
//        }
//        // the statement in else will also be printed out, because Java compiler will check each statement by statement
//        else {
//            System.out.println("No Profit");
//        }

        boolean isLoggedIn = true;
        boolean isEmailVerified = false;
        boolean isCardInfoValid = true;

        if(isLoggedIn && isEmailVerified && isCardInfoValid) {
            System.out.println("You are allowed to make a purchase");
        } else {
            System.out.println("You are not allowed to make a purchase");

        }
    }
}
