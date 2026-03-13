class Solution {
    public int minDeletionSize(String[] strs) {
        
        int len = strs.length;
        int strLen = strs[0].length();
        char[][] ch = new char[len][strLen];
        for (int i = 0; i < len; i++) {
            char[] charStr = strs[i].toCharArray();
            for (int j = 0; j < strLen; j++) {
                ch[i][j] = charStr[j];
            }
        }
        int count = 0;
        for (int i = 0; i < strLen; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (ch[j][i] > ch[j + 1][i]) {
                    count++;
                    break;
                }
            }
        }
        return count;

    }
}