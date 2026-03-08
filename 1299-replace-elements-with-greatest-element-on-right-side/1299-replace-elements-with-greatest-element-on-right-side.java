class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int res[] = new int[len];
        for (int i = 0; i < len; i++) {
            int maxNum = -1;
            for(int j = i+1;j<len;j++){
                maxNum = Math.max(maxNum,arr[j]);
            }
            res[i] = maxNum;
        }
        return res;
    }
}