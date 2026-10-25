class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        if (nums.length < 2)
            return nums;
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        for (int i : nums) {
            if (i < pivot) {
                l1.add(i);
            } else if (i > pivot) {
                l2.add(i);
            } else {
                l2.addFirst(i);
            }
        }

        int index = 0;
        for (int i : l1) {
            nums[index] = i;
            index++;
        }

        for (int i : l2) {
            nums[index] = i;
            index++;
        }

        return nums;
    }
}