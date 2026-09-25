public class WordReversalEncoder {

    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();
            result.append(reversed).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("hello club"));
    }
}
