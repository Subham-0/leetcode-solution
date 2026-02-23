class Solution {
    public String concatHex36(int n) {
        StringBuilder str = new StringBuilder();
        int square = n * n;
        int cube = square * n;
        int rem;
        while (cube > 0) {
            rem = cube % 36;
            if (rem < 10) {
                str.append((char) ('0' + rem));
            } else {
                str.append((char) ('A' + rem - 10));
            }
            cube /= 36;
        }

        while (square > 0) {
            rem = square % 16;
            if (rem < 10) {
                str.append((char) ('0' + rem));
            }
            else {
                str.append((char) ('A' + rem - 10));
            }
            square /= 16;
        }
        str.reverse();
        return str.toString();
    }
}