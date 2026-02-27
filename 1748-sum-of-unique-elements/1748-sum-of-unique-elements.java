class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                sum += num;
            }
        }
        return sum;
    }

}