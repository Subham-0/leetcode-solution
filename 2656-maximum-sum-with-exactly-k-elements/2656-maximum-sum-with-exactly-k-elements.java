class Solution {
    public int maximizeSum(int[] nums, int k) {
        int len = nums.length;
        int max = nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int sum = 0;
        while (k-- > 0) {
            sum += max;
            max++;
        }
        return sum;
    }
}