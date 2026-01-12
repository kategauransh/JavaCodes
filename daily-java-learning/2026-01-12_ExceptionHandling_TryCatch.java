public class ExceptionHandling_TryCatch {
    public static void main(String[] args) {
        try {
            // Attempt to divide by zero
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            // This block will always execute
            System.out.println("Execution completed.");
        }
    }
}