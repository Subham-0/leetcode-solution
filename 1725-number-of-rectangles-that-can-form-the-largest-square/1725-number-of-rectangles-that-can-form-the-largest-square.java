class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int len = rectangles.length;
        int count = 0;
        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            int min = Math.min(rectangles[i][0], rectangles[i][1]);
            if (min > maxLen) {
                maxLen = min;
                count = 1;
            } else if (min == maxLen) {
                count++;
            }
        }
        return count;
    }
}