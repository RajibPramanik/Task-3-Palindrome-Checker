public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove all non-alphanumeric characters and convert to lowercase
        // This ensures we're comparing only letters and numbers, and case doesn't matter
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string using StringBuilder
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        // Compare the cleaned string with its reversed version
        return cleanedStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        // Test cases to check different strings
        String testCase1 = "madam";  // Palindrome example
        String testCase2 = "Hello";  // Non-palindrome example
        String testCase3 = "A man, a plan, a canal: Panama"; // Palindrome with spaces and punctuation
        String testCase4 = "No 'x' in Nixon"; // Palindrome with spaces and punctuation

        // Print the results for each test case
        System.out.println("--- Palindrome Checker Results ---");

        // Check if testCase1 is a palindrome and print the result
        System.out.println("String: \"" + testCase1 + "\"");
        System.out.println("Result: " + (isPalindrome(testCase1) ? "Palindrome." : "Not a palindrome."));
        System.out.println("----------------------------------");

        // Check if testCase2 is a palindrome and print the result
        System.out.println("String: \"" + testCase2 + "\"");
        System.out.println("Result: " + (isPalindrome(testCase2) ? "Palindrome." : "Not a palindrome."));
        System.out.println("----------------------------------");

        // Check if testCase3 is a palindrome and print the result
        System.out.println("String: \"" + testCase3 + "\"");
        System.out.println("Result: " + (isPalindrome(testCase3) ? "Palindrome (Ignoring spaces and punctuation)." : "Not a palindrome."));
        System.out.println("----------------------------------");

        // Check if testCase4 is a palindrome and print the result
        System.out.println("String: \"" + testCase4 + "\"");
        System.out.println("Result: " + (isPalindrome(testCase4) ? "Palindrome (Ignoring spaces and punctuation)." : "Not a palindrome."));
        System.out.println("----------------------------------");
    }
}
