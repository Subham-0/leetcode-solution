class Solution {
    public boolean completePrime(int num) {
        if (!isPrime(num))
            return false;

        String s = Integer.toString(num);
        int len = s.length();

        for (int i = 1; i <= len; i++) {
            int prefix = Integer.parseInt(s.substring(0, i));
            int suffix = Integer.parseInt(s.substring(len - i, len));
            if (!isPrime(prefix) || !isPrime(suffix)) {
                return false;
            }
        }

        return true;
    }

    public boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
