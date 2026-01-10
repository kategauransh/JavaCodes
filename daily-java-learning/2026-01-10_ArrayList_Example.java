import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {
        // Create an ArrayList to store String elements
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Print the ArrayList
        System.out.println("Fruits in the list: " + fruits);

        // Remove an element from the ArrayList
        fruits.remove("Banana");

        // Print the updated ArrayList
        System.out.println("Updated fruits list: " + fruits);

        // Accessing an element by its index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);
    }
}