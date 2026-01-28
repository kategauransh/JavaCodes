public class EncapsulationExample {
    // Private variable to hold the age
    private int age;

    // Public method to set the age
    public void setAge(int age) {
        if (age > 0) { // Ensure age is positive
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    // Public method to get the age
    public int getAge() {
        return age; // Return the value of age
    }

    public static void main(String[] args) {
        // Create an instance of EncapsulationExample
        EncapsulationExample example = new EncapsulationExample();

        // Set the age
        example.setAge(25);
        // Retrieve and print the age
        System.out.println("Age: " + example.getAge());
    }
}