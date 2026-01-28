public class ExceptionHandling_TryCatchExample {
    public static void main(String[] args) {
        // Example of dividing two numbers
        int numerator = 10;
        int denominator = 0; // This will cause an exception

        try {
            // This line may throw an ArithmeticException
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: Cannot divide by zero!");
        }

        System.out.println("Program continues after the exception.");
    }
}