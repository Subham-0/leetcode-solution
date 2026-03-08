class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        char[] ch = s.toCharArray();
        for (; i >= 0; i--) {
            if (ch[i] != ' ') {
                break;
            }
        }
        int count = 0;
        for (int j = i; j >= 0; j--) {
            if (ch[j] == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

}