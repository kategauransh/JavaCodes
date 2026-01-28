import java.util.Scanner;

// Interface for Electric Vehicle features
interface ElectricVehicle {
    void showHybridFeature();
}

// Base Class
class Vehicle {
    void showType() {
        System.out.println("Generic Vehicle");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    void showType() {
        System.out.println("Vehicle Type: Car");
    }
}

// Subclass Truck
class Truck extends Vehicle implements ElectricVehicle {
    @Override
    void showType() {
        System.out.println("Vehicle Type: Truck");
    }

    @Override
    public void showHybridFeature() {
        System.out.println("Hybrid Feature: Electric Assist Enabled");
    }
}

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter choice (1 for Car, 2 for Truck, 3 for Array Demo):");

        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Car car = new Car();
                    car.showType();
                    break;

                case 2:
                    Truck truck = new Truck();
                    truck.showType();
                    truck.showHybridFeature();
                    break;

                case 3:
                    // Polymorphism Demo
                    Vehicle[] vehicles = { new Car(), new Truck() };

                    System.out.println("\n--- Polymorphism Demo ---");
                    for (Vehicle v : vehicles) {
                        v.showType(); // Dynamic Dispatch works here

                        // Check if the vehicle is also an ElectricVehicle to call specific methods
                        if (v instanceof ElectricVehicle) {
                            ((ElectricVehicle) v).showHybridFeature();
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("Please enter a valid number.");
        }

        scanner.close();
    }
}
