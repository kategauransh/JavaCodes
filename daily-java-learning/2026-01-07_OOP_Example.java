public class OOP_Example {
    // Class representing a simple Car
    class Car {
        String color;
        String model;

        // Constructor to initialize Car
        Car(String color, String model) {
            this.color = color;
            this.model = model;
        }

        // Method to display Car details
        void displayDetails() {
            System.out.println("Car Model: " + model + ", Color: " + color);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of Car
        OOP_Example example = new OOP_Example();
        Car myCar = example.new Car("Red", "Toyota");
        
        // Displaying the details of the Car
        myCar.displayDetails();
    }
}