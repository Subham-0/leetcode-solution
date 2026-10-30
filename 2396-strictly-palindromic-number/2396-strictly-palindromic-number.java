class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean flag = true;
        for (int i = 2; i <= n - 2; i++) {
            String base = Integer.toString(n, i);
            if (!isPalindrome(base)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

     private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}