package FunctionalInterface.FunctionalInterfaceDemo;

interface vehicle {
    void run();
}

public class FunctionalInterfaceDemo11 {
    public static void main(String[] args) {
        vehicle car = () -> System.out.println("Car is running");
        car.run();

        vehicle bike = () -> System.out.println("Bike is running");
        bike.run();

        vehicle bmw = () -> IO.println("BMW is running");
        bmw.run();
    }
}
