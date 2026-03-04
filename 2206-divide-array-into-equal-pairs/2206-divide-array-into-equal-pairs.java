class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0;
        while (i < n) {
            if (nums[i] != nums[i + 1]) {
                return false;
            }
            i += 2;
        }
        return true;

    }
}