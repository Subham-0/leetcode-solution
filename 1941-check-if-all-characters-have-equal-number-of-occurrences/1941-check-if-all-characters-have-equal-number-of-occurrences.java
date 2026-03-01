class Solution {
    public boolean areOccurrencesEqual(String s) {
        char[] freq = new char[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int first = 0;
        for (int n : freq) {
            if (n != 0) {
                if (first == 0) {
                    first = n;
                } else if (first != n) {
                    return false;
                }
            }
        }
        return true;
    }
}