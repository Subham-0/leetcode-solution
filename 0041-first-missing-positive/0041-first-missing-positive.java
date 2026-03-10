class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int p = 1;
        while (true) {
            if (!set.contains(p)) {
                return p;
            }
            p++;
        }

    }
}