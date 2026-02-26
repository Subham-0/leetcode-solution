class Solution {
    public int minSwaps(int[] nums) {
        int len = nums.length;
        Integer[] sorted = new Integer[len];
        for (int i = 0; i < len; i++) {
            sorted[i] = nums[i];
        }

        Arrays.sort(sorted, (a, b) -> {
            int sumOfA = digitSum(a);
            int sumOfB = digitSum(b);

            if (sumOfA == sumOfB) {
                return a - b;
            }

            return sumOfA - sumOfB;
        });
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < len; i++) {
            map.put(sorted[i], i);
        }

        boolean[] visited = new boolean[len];
        int cycles = 0;

        for (int i = 0; i < len; i++) {
            if (visited[i]) {
                continue;
            }
            cycles++;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = map.get(nums[j]);
            }
        }
        return len - cycles;
    }
    public int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}