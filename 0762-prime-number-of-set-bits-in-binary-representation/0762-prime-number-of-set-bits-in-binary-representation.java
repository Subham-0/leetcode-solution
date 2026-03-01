class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int bitCount = 0;
            int num = i;
            while (num > 0) {
                if (num % 2 == 1) {
                    bitCount++;
                }
                num /= 2;
            }
            if (isPrime(bitCount)) {
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if ( n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}