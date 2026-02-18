class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] str = s.toCharArray();
        int total = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            total = (total + shifts[i]) % 26;
            str[i] = (char) ((str[i] - 'a' + total) % 26 + 'a');

        }
        return String.valueOf(str);
    }
}