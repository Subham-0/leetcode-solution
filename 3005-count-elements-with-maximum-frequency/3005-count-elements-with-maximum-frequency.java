class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int total = 0;

        for (int num : nums) {
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);

            if (freq > max) {
                max = freq;
                total = freq;
            } else if (freq == max) {
                total += freq;
            }
        }

        return total;

    }
}