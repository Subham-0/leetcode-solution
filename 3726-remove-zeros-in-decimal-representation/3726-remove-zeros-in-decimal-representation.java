class Solution {
    public long removeZeros(long n) {
        long result = 0;
        long place = 1;
        while (n > 0) {
            if (n % 10 != 0) {
                result += (n % 10) * place;
                place *= 10;
            }
            n /= 10;
        }

        return result;

    }
}