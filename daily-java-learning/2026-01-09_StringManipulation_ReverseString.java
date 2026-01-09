public class StringManipulation_ReverseString {
    public static void main(String[] args) {
        String input = "Java Backend Development";
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    // Method to reverse the input string
    public static String reverseString(String str) {
        StringBuilder reversedStr = new StringBuilder();
        
        // Loop through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i)); // Append each character
        }
        
        return reversedStr.toString(); // Return the reversed string
    }
}