class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int i : nums) {
            if (set.contains(i)) {
                res ^= i;
            } else {
                set.add(i);
            }
        }
        return res;
    }
}