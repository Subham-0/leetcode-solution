class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int i : apple) {
            sum += i;
        }
        Arrays.sort(capacity);
        int capaSum = 0;
        int count = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            capaSum += capacity[i];
            count++;
            if (capaSum >= sum) {
                break;
            }

        }
        return count;
    }
}