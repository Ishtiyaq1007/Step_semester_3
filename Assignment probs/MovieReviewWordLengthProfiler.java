public class MovieReviewWordLengthProfiler {

    // Method to classify word lengths
    public static void classifyWordLengths(String review) {
        String[] words = review.split("\\s+"); // split by spaces
        int shortCount = 0, mediumCount = 0, longCount = 0;

        for (String word : words) {
            int length = word.length();
            if (length >= 1 && length <= 4) {
                shortCount++;
            } else if (length >= 5 && length <= 8) {
                mediumCount++;
            } else if (length >= 9) {
                longCount++;
            }
        }

        System.out.println("Short: " + shortCount + " | Medium: " + mediumCount + " | Long: " + longCount);
    }

    public static void main(String[] args) {
        String review = "This movie was absolutely fantastic and thrilling";
        classifyWordLengths(review);
    }
}
