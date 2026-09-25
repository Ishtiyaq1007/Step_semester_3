public class TypingAccuracyChecker {

    // Method to check typing accuracy
    public static void checkTypingAccuracy(String original, String typed) {
        if (original.length() != typed.length()) {
            System.out.println("Error: Strings must be of equal length.");
            return;
        }

        int matches = 0;
        int firstMismatchPos = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matches++;
            } else {
                if (firstMismatchPos == -1) {
                    firstMismatchPos = i + 1; // 1-based position
                }
            }
        }

        double accuracy = (matches * 100.0) / original.length();

        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%%n", matches, original.length(), accuracy);

        if (firstMismatchPos != -1) {
            System.out.printf("First Mismatch at position %d ('%c' vs '%c')%n",
                    firstMismatchPos, original.charAt(firstMismatchPos - 1), typed.charAt(firstMismatchPos - 1));
        } else {
            System.out.println("No Mismatches");
        }
    }

    public static void main(String[] args) {
        String original1 = "hello world";
        String typed1 = "hello worlt";

        String original2 = "coding";
        String typed2 = "coding";

        System.out.println("Test 1:");
        checkTypingAccuracy(original1, typed1);

        System.out.println("\nTest 2:");
        checkTypingAccuracy(original2, typed2);
    }
}
