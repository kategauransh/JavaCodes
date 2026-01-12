import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {
        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Displaying the names
        System.out.println("Names in the list:");
        for (String name : names) {
            System.out.println(name);
        }

        // Getting the size of the ArrayList
        System.out.println("Total names: " + names.size());
        
        // Removing an element
        names.remove("Bob");
        System.out.println("After removal, names in the list:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}