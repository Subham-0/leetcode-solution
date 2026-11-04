class Solution {
    public int[] findDegrees(int[][] matrix) {
        int len = matrix.length;
        int res[] = new int[len];
        for (int i = 0; i < len; i++) {
            int c = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    c++;
                }
            }
            res[i] = c;
        }
        return res;
    }
}