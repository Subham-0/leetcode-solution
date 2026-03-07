class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            currentSum += nums[i];
            if (i >= k-1 ) {
                maxSum =Math.max(maxSum, currentSum);
                currentSum -= nums[i - (k-1)];
            }
        }
        return (double)maxSum/k;
    }
}