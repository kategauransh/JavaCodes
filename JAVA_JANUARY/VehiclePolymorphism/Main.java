
import java.util.Scanner;

public class Main {
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
                    Vehicle[] vehicles = { new Car(), new Truck() };

                    System.out.println("\n--- Polymorphism Demo ---");
                    for (Vehicle v : vehicles) {
                        v.showType();
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
