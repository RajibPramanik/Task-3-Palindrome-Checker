public class PalindromeChecker {

    public static void main(String[] args) {

        String str1 = "madam";
        String str2 = "hello";
        String str3 = "whether";

        checkPalindrome(str1);
        checkPalindrome(str2);
        checkPalindrome(str3);
    }

    // Method to check palindrome
    public static void checkPalindrome(String str) {
        String reversed = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Compare original and reversed
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
