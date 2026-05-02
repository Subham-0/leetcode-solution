class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[2*n];
        int p= 0;
        for(int i=0;i<n;i++){
            res[p++]=nums[i];
            res[p++]=nums[n+i];
        }
        return res;

    }
}