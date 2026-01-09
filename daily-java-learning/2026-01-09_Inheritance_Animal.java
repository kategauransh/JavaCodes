class Animal {
    // Method to represent an animal sound
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

// Dog class inherits from Animal
class Dog extends Animal {
    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Inheritance_Animal {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Create a Dog object
        dog.makeSound(); // Call the method to display the sound
    }
}