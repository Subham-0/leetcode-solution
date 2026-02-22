class Solution {
    public int[] separateDigits(int[] nums) {
        int len = nums.length;
        List<Integer> list = new ArrayList();

        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] > 9) {
                int n = nums[i];
                while (n != 0) {

                    list.add(n % 10);
                    n /= 10;
                }
            } else {
                list.add(nums[i]);
            }
        }

        int[] result = new int[list.size()];
        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            result[size - 1 - i] = list.get(i);
        }

        return result;
    }
}