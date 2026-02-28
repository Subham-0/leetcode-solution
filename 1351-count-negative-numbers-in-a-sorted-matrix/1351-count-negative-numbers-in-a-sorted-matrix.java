class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int rowLen = grid.length;
        for (int r = 0; r < rowLen; r++) {
            int colLen = grid[r].length;
            for (int c = colLen - 1; c >= 0; c--) {
                if (grid[r][c] < 0) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}