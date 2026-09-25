public class PalindromeChecker {

    // Iterative approach
    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Recursive approach
    public static boolean isPalindromeRecursive(String text) {
        return isPalindromeRecursiveHelper(text, 0, text.length() - 1);
    }

    private static boolean isPalindromeRecursiveHelper(String text, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (text.charAt(left) != text.charAt(right)) {
            return false;
        }
        return isPalindromeRecursiveHelper(text, left + 1, right - 1);
    }

    // Array reversal approach
    public static boolean isPalindromeArrayReversal(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    // Main method to test all three
    public static void main(String[] args) {
        String input1 = "madam";
        String input2 = "hello";

        testInput(input1);
        testInput(input2);
    }

    private static void testInput(String input) {
        System.out.println("Input: " + input);
        System.out.println("Iterative: " + (isPalindromeIterative(input) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive: " + (isPalindromeRecursive(input) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Array Reversal: " + (isPalindromeArrayReversal(input) ? "Palindrome" : "Not Palindrome"));
        System.out.println();
    }
}
