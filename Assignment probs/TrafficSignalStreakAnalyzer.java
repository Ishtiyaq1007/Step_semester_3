public class TrafficSignalStreakAnalyzer {

    // Method to find the longest streak of identical signals
    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Signal log is empty.");
            return;
        }

        char longestChar = signalLog.charAt(0);
        int longestStreak = 1;

        char currentChar = signalLog.charAt(0);
        int currentStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentChar) {
                currentStreak++;
            } else {
                currentChar = signalLog.charAt(i);
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                longestChar = currentChar;
            }
        }

        System.out.println("Longest Streak: '" + longestChar + "' repeated " + longestStreak + " times");
    }

    public static void main(String[] args) {
        String log1 = "RRGGGYRR";
        String log2 = "RRRRYYG";

        System.out.println("Log 1:");
        findLongestStreak(log1);

        System.out.println("\nLog 2:");
        findLongestStreak(log2);
    }
}
