class Solution {
    public String freqAlphabets(String s) {
        StringBuilder res = new StringBuilder();
        int len = s.length();

        for (int i = 0; i < len; ) {
            if (i + 2 < len && s.charAt(i + 2) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 2));
                res.append((char) ('a' + num - 1));
                i += 3;
            } 
            else {
                int num = s.charAt(i) - '0';
                res.append((char) ('a' + num - 1));
                i++;
            }
        }

        return res.toString();
    }
}