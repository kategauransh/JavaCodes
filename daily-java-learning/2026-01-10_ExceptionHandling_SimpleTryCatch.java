public class ExceptionHandling_SimpleTryCatch {
    public static void main(String[] args) {
        try {
            // Attempt to divide by zero
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    // Method to perform division
    public static int divide(int a, int b) {
        return a / b; // May throw an ArithmeticException
    }
}