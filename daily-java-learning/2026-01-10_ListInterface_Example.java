import java.util.ArrayList;
import java.util.List;

public class ListInterface_Example {

    public static void main(String[] args) {
        // Create a List to store string elements
        List<String> fruits = new ArrayList<>();

        // Adding elements to the List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana"); // Duplicate element

        // Print the List
        System.out.println("Fruits List: " + fruits);

        // Accessing an element
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit: " + firstFruit);

        // Removing an element
        fruits.remove("Banana"); // Removes the first occurrence
        System.out.println("After removal: " + fruits);
    }
}