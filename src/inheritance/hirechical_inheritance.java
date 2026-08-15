package inheritance;

public class hirechical_inheritance {
//    A
//    / \
//    B     C
    public static void main(String[] args) {
        Car car = new Car();
        car.brand="Totyota Fortuner";
        car.start();
        car.drive();
        System.out.println("=========================");
        Bike bike = new Bike();
        bike.brand="Yamaha";
        bike.start();
        bike.ride();

    }
}
// Parent Class (Superclass)
class Vehicle {
    String brand;

    void start() {
        System.out.println("The vehicle is starting...");
    }
}

// Child Class 1 (Subclass)
class Car extends Vehicle {
    int numberOfDoors = 4;

    void drive() {
        System.out.println("The car is driving on four wheels.");
    }
}

// Child Class 2 (Subclass)
class Bike extends Vehicle {
    boolean hasCarrier = true;

    void ride() {
        System.out.println("The bike is riding on two wheels.");
    }
}
