import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Display the elements
        System.out.println("Fruits in the list: " + fruits);

        // Remove an element from the ArrayList
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Accessing an element by index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit in the list: " + firstFruit);
    }
}