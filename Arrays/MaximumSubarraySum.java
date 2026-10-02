package Arrays;
public class MaximumSubarraySum {
    
    public static int maxSubarraySum(int[] nums) {
        // Initialize maxSum to the smallest possible integer to handle all-negative arrays
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            // Add the current element to the running sum
            currentSum += num;

            // Update the maximum sum found so far
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If the current sum drops below 0, reset it.
            // A negative prefix will only decrease the sum of any future subarray.
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] sample1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] sample2 = {-8, -3, -6, -2, -5};

        System.out.println("Max Subarray Sum (Mixed): " + maxSubarraySum(sample1)); // Output: 6 ([4, -1, 2, 1])
        System.out.println("Max Subarray Sum (All Negative): " + maxSubarraySum(sample2)); // Output: -2 ([-2])
    }
}

