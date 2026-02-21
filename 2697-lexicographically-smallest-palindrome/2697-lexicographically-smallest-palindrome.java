class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                char minChar = (char) Math.min(arr[i], arr[n - 1 - i]);
                arr[i] = minChar;
                arr[n - 1 - i] = minChar;
            }
        }

        return new String(arr);
    }
}