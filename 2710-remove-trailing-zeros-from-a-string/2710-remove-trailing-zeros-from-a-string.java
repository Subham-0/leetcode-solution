class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder str = new StringBuilder();
        boolean mark = false;
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if (mark) {
                str.append(ch);
            } else if (ch != '0') {
                str.append(ch);
                mark = true;
            }
        }
        str.reverse();
        return str.toString();
    }
}