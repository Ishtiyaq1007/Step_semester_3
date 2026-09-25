public class WarehouseInventoryBalancer {

    // Method to analyze inventory
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA.length != sectionB.length) {
            System.out.println("Error: Sections must have equal length.");
            return;
        }

        // Compute totals
        int totalA = 0, totalB = 0;
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];
        }

        // Compare totals
        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        // Find highest quantity across both sections
        int highest = sectionA[0];
        String location = "Section A, Item 1";

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                location = "Section A, Item " + (i + 1);
            }
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                location = "Section B, Item " + (i + 1);
            }
        }

        // Print report
        System.out.println("Section A Total: " + totalA +
                           " | Section B Total: " + totalB +
                           " | Status: " + status +
                           " | Highest Quantity: " + highest + " (" + location + ")");
    }

    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        analyzeInventory(sectionA, sectionB);
    }
}
