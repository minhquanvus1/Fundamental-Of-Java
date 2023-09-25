package Polymorphism;

class Calculation {
    public static int addition(int a, int b) {
        return a + b;
    }
    public static int addition(int a, int b, int c) {
        return a + b + c;
    }
    public static float addition(float a, float b) {
        return a + b;
    }
    public static float addition(int a, float b) {
        return a + b;
    }
}
public class MethodOverloadingExample {
    public static void main(String[] args) {
        System.out.println(Calculation.addition(1,2));
        System.out.println(Calculation.addition(1,2, 3));
        System.out.println(Calculation.addition(1.5F,1.5F));
        System.out.println(Calculation.addition(1,2.5F));



    }
}
