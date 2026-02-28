class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder str = new StringBuilder();
        int len = num.length() - 1;
        while (len >= 0) {
            if (num.charAt(len) == '0') {
                len--;
            } else {
                return num.substring(0, len + 1);
            }
        }
        return num;

    }
}