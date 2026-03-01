class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] res = new int[len];

        if (k == 0)
            return res;

        for (int i = 0; i < len; i++) {
            int sum = 0;

            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    int index = (i + j) % len;
                    sum += code[index];
                }
            } else {
                for (int j = 1; j <= Math.abs(k); j++) {
                    int index = (i - j + len) % len;
                    sum += code[index];
                }
            }

            res[i] = sum;
        }

        return res;

    }
}