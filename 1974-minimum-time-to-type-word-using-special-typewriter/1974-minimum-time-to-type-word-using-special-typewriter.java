class Solution {
    public int minTimeToType(String word) {
        int sec = 0;
        char prev = 'a';

        for (char ch : word.toCharArray()) {
            int diff = Math.abs(ch - prev);
            int min = Math.min(diff, 26 - diff);
            sec += min + 1;
            prev = ch;
        }

        return sec;
    }
}