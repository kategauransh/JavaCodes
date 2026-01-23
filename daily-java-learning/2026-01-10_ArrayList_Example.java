import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {
        // Create an ArrayList to store String elements
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print the elements of the ArrayList
        System.out.println("Fruits in the list: " + fruits);

        // Access an element by index
        String firstFruit = fruits.get(0);
        System.out.println("The first fruit is: " + firstFruit);

        // Remove an element
        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits);
    }
}