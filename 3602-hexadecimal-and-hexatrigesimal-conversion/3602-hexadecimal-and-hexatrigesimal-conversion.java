class Solution {
    public String concatHex36(int n) {
       int square = n * n;
        int cube = n * n * n;

        String squareStr = Integer.toString(square, 16).toUpperCase();
        String cubeStr = Integer.toString(cube, 36).toUpperCase();

        return squareStr + cubeStr;
    }
}