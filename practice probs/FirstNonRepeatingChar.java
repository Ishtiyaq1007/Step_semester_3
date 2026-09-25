import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    // Method to find the first non-repeating character
    public static Character findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : text.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with frequency 1
        for (char c : text.toCharArray()) {
            if (freqMap.get(c) == 1) {
                return c;
            }
        }

        return null; // No non-repeating character found
    }

    public static void main(String[] args) {
        String input1 = "swiss";
        String input2 = "aabbcc";

        Character result1 = findFirstNonRepeatingChar(input1);
        Character result2 = findFirstNonRepeatingChar(input2);

        if (result1 != null) {
            System.out.println("Input: " + input1 + " → First Non-Repeating Character: '" + result1 + "'");
        } else {
            System.out.println("Input: " + input1 + " → No Non-Repeating Character Found");
        }

        if (result2 != null) {
            System.out.println("Input: " + input2 + " → First Non-Repeating Character: '" + result2 + "'");
        } else {
            System.out.println("Input: " + input2 + " → No Non-Repeating Character Found");
        }
    }
}
