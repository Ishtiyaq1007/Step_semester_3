public class BmiCalculator {

    // Method to classify BMI status
    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to print the wellness report
    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.printf("%-10s %-12s %-12s %-10s %-12s%n", 
                          "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            String status = getBmiStatus(bmi);
            System.out.printf("%-10s %-12.2f %-12.2f %-10.2f %-12s%n", 
                              "Person " + (i + 1), heights[i], weights[i], bmi, status);
        }
    }

    public static void main(String[] args) {
        // Example: 10 employees with random values
        double[] heights = {1.75, 1.60, 1.82, 1.70, 1.55, 1.68, 1.90, 1.72, 1.65, 1.80};
        double[] weights = {70, 90, 75, 60, 50, 85, 95, 68, 72, 100};

        printWellnessReport(heights, weights);
    }
}
