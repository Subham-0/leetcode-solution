class Solution {
    public String reverseByType(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            if (isLetter(ch[i]) && isLetter(ch[j])) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            } else if (!isLetter(ch[i])) {
                i++;
            } else {
                j--;
            }
        }

        int p = 0;
        int q = ch.length - 1;

        while (p < q) {
            if (!isLetter(ch[p]) && !isLetter(ch[q])) {
                char temp = ch[p];
                ch[p] = ch[q];
                ch[q] = temp;
                p++;
                q--;
            } else if (isLetter(ch[p])) {
                p++;
            } else {
                q--;
            }
        }

        return new String(ch);
    }

    private boolean isLetter(char c) {
        return c >= 'a' && c <= 'z';
    }
}