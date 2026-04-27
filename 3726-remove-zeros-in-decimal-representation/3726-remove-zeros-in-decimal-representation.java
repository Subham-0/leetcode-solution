class Solution {
    public long removeZeros(long n) {
        String number = Long.toString(n);
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '0') {
                res.append(number.charAt(i));
            }
        }

        if (res.length() == 0) return 0;

        return Long.parseLong(res.toString());
    }
}