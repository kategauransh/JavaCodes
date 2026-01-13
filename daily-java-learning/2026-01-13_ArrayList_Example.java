import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {
        // Create an ArrayList to store String elements
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Display the elements in the ArrayList
        System.out.println("Fruits in the list: " + fruits);

        // Accessing an element at index 1
        String secondFruit = fruits.get(1);
        System.out.println("The second fruit is: " + secondFruit);

        // Remove an element from the ArrayList
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
    }
}