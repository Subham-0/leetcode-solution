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

        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i : nums) {
        //     map.put(i, map.getOrDefault(i, 0) + 1);
        // }
        // for (Integer value : map.values()) {
        //     if (value % 2 != 0) {
        //         return false;
        //     }
        // }
        // return true;

    }
}