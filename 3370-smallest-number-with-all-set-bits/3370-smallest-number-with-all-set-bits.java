class Solution {
    public int smallestNumber(int n) {
        int i = 1;
        while (true) {
            int val = power(2, i) - 1;
            if (val >= n) {
                return val;
            }
            i++;
        }
    }

    static int power(int b, int e) {
        int p = 1;
        while (e-- > 0) {
            p *= b;

        }
        return p;
    }
}