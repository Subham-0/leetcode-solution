class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int res[] = new int[len];
        int maxNum = -1;
        for (int i = len - 1; i >= 0; i--) {
            res[i] = maxNum;
            maxNum = Math.max(maxNum, arr[i]);

        }
        return res;
    }
}