class Solution {
    public String finalString(String s) {
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch != 'i') {
                str.append(ch + "");
            } else {
                str.reverse();
            }
        }
        return str.toString();
    }
}