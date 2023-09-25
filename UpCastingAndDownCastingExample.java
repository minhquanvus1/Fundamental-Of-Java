
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle...");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a Car");
    }
    void speedUp() {
        System.out.println("Speeding up a Car");
    }
}
public class UpCastingAndDownCastingExample {
    public static void main(String[] args) {
        // Upcasting (implicitly)
        Vehicle vehicle1 = new Car();
        vehicle1.drive();
// Downcasting (explicitly)
        Vehicle vehicle = new Car();
        Car car = (Car)  vehicle;
        car.drive();
        car.speedUp();
    }
}
