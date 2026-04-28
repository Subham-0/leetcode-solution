class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
 int[] sortedUniqueArray = Arrays.stream(nums).sorted().distinct().toArray();
        int n = sortedUniqueArray.length;

        int size = Math.min(k, n);
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = sortedUniqueArray[n - 1 - i];
        }

        return result;
    }

}