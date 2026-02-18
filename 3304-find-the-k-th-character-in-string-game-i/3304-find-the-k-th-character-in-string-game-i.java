class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {
            int size = word.length();
            for (int i = 0; i < size; i++) {
                word.append((char)(word.charAt(i)+1));
            }
        }
        return word.charAt(k - 1);
    }
}