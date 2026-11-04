class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int x : matrix[i]) {
                sum += x;
            }
            ans[i] = sum;
        }
        return ans;
    }
}