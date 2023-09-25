public class TypeCastingExample {
    public static void main(String[] args) {
//        int intValue = 100;
//        // casting an "int" --> "long" (implicitly)
//        long longValue = intValue;
//        // casting a "long" --> "double" (implicitly)
//        double doubleValue = longValue;
//
//        System.out.println(intValue);
//        System.out.println(longValue);
//        System.out.println(doubleValue);

        double doubleValue = 100.56;
        // explicit type casting: from "double" --> "int" (can result in data loss)
        int intValue = (int) doubleValue;
        System.out.println(doubleValue);
        System.out.println(intValue);


    }
}
