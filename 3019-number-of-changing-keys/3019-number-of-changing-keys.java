class Solution {
    public int countKeyChanges(String s) {
        int count = 0;

        String lower = s.toLowerCase();
        for (int i = 0; i < lower.length() - 1; i++) {
            if (lower.charAt(i) != lower.charAt(i + 1)) {
                count++;
            }
        }
        return count;

    }
}