class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        double currentSum = 0;
        double maxAvg = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            currentSum += nums[i];
            if (i >= k-1 ) {
                double avg = currentSum/(double)k;
                maxAvg =Math.max(maxAvg, avg);
                currentSum -= nums[i - (k-1)];
            }
        }
        return maxAvg;
    }
}