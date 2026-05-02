class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                count = 0;
            } else {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            }

        }
        return maxCount;
    }
}