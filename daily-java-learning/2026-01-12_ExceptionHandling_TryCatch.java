public class ExceptionHandling_TryCatch {
    public static void main(String[] args) {
        try {
            // Attempt to divide by zero to trigger an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception and print an error message
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Method to perform division
    public static int divide(int numerator, int denominator) {
        return numerator / denominator; // This can throw an ArithmeticException
    }
}