import java.util.HashMap;

public class SubarraySumEqualsK {

    static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        // Empty prefix
        prefixSumCount.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            // Check if an earlier prefix sum = currentSum - k
            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k);
            }

            // Store/update frequency of current prefix sum
            prefixSumCount.put(
                currentSum,
                prefixSumCount.getOrDefault(currentSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 1};
        System.out.println(subarraySum(nums1, 2));

        int[] nums2 = {1, -1, 0};
        System.out.println(subarraySum(nums2, 0));
    }
}
