class Solution {
    public int[] concatWithReverse(int[] nums) {
        int len = nums.length;
        int res[] = new int[2 * len];
        for (int i = 0; i < len; i++) {
            res[i] = nums[i];
            res[2 * len - 1 - i] = nums[i];
        }
        return res;
    }
}