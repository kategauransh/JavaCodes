import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {
        // Create an ArrayList to store String items
        ArrayList<String> fruits = new ArrayList<>();

        // Add items to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print ArrayList contents
        System.out.println("Fruits List: " + fruits);

        // Remove an item
        fruits.remove("Banana");

        // Print updated ArrayList contents
        System.out.println("Updated Fruits List: " + fruits);

        // Get the size of the ArrayList
        System.out.println("Total fruits: " + fruits.size());
    }
}