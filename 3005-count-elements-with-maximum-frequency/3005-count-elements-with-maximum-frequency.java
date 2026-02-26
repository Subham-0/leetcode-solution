class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int maxFrequency = Collections.max(map.values());
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(maxFrequency)) {
                sum += maxFrequency;
            }
        }
        return sum;
    }
}